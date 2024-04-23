package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	@Before
	public void startflow() {
		System.err.println("====> Flow Started <====");
	}
	@Before("@AdminDB")
	public void connect_admin_DB() {
		System.out.println("***** Connected with Admin DB *****");
	}
	@Before("@NoramalDB")
	public void connect_Noraml_DB() {
		System.out.println("***** Connected with Admin DB *****");
	}
	@After("@AdminDB")
	public void disconnect_admin_DB() {
		System.out.println("***** Disonnected with Admin DB *****");
	}
	@After("@NoramalDB")
	public void disconnect_Noraml_DB() {
		System.out.println("***** Disconnected with Admin DB *****");
	}
	@After
	public void endflow() {
		System.err.println("====> Flow Completed <====");
	}
}
