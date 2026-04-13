package org.example;

import org.testng.annotations.*;

public class exercise3 {

    // 🔹 Runs before Smoke group
    @BeforeGroups("Smoke")
    public void beforeSmoke() {
        System.out.println("=== STARTING SMOKE TESTS ===");
    }

    // 🔹 Runs after Smoke group
    @AfterGroups("Smoke")
    public void afterSmoke() {
        System.out.println("=== FINISHED SMOKE TESTS ===");
    }

    // 🔹 Runs before Regression group
    @BeforeGroups("Regression")
    public void beforeRegression() {
        System.out.println("=== STARTING REGRESSION TESTS ===");
    }

    // 🔹 Runs after Regression group
    @AfterGroups("Regression")
    public void afterRegression() {
        System.out.println("=== FINISHED REGRESSION TESTS ===");
    }

    // ================= SMOKE =================

    @Test(groups = {"Smoke"})
    public void testHomepageLoads() {
        System.out.println("Homepage Loaded");
    }

    @Test(groups = {"Smoke"})
    public void testLoginPageVisible() {
        System.out.println("Login Page Visible");
    }

    @Test(groups = {"Smoke"})
    public void testFooterLinks() {
        System.out.println("Footer Links Working");
    }

    // ================= REGRESSION =================

    @Test(groups = {"Regression"})
    public void testLoginValidCreds() {
        System.out.println("Valid Login Test");
    }

    @Test(groups = {"Regression"})
    public void testLoginInvalidCreds() {
        System.out.println("Invalid Login Test");
    }

    @Test(groups = {"Regression"})
    public void testPasswordReset() {
        System.out.println("Password Reset Test");
    }

    @Test(groups = {"Regression"})
    public void testAccountBalance() {
        System.out.println("Account Balance Test");
    }
}
