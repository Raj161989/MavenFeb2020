package VctcChinchwad.MavenFeb2020;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

public class NewTestngListnerClass implements ITestListener {


	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Reslult are started :" + result.getName() );
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Reslult are success :" + result.getName() );
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Reslult are Filed :" + result.getName() );
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Reslult are skipped :" + result.getName() );
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Reslult are started :" + result.getName() );
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
