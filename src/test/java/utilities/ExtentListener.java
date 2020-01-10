package utilities;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.testng.*;

public class ExtentListener extends ExtentManager implements ITestListener   {

    @Override
    public void onTestStart(ITestResult result) {
        create_test(result.getName());
        test.log(Status.INFO, result.getMethod().getDescription() + " test started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getName()+ " passed successfully");
        test.log(Status.PASS, result.getMethod().getDescription() + " test passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName() +  " test failed");
        try {
            test.fail(result.getTestName(), MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen()).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
        test.fail(result.getThrowable());
        test.log(Status.FAIL, result.getMethod().getDescription() + " test failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onStart(ITestContext context) {
        init();
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }

}