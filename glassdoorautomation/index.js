const puppeteer = require('puppeteer');

async function runAutomation() {
    const browser = await puppeteer.launch({
        headless: false, // For debugging purposes
        defaultViewport: null, // Opens the browser in full-screen mode
        args: ['--start-maximized'], // Optional: Start the browser maximized
    });

    const page = await browser.newPage();

    try {
        // Step 1: Open the Glassdoor website
        console.log("Navigating to Glassdoor...");
        await page.goto('https://www.glassdoor.co.in/index.htm', { waitUntil: 'networkidle2' });

        // Step 2: Wait for the email input field to appear
        const emailInputSelector = 'input[name="username"]'; // Confirmed selector for email input
        await page.waitForSelector(emailInputSelector, { timeout: 30000 });
        console.log("Email input field detected...");

        // Step 3: Enter email
        const email = 'aks969014@gmail.com'; // Replace with your email
        await page.type(emailInputSelector, email);
        console.log("Email entered...");

        // Step 4: Click on the "Continue with Email" button
        const continueButtonSelector = 'button[data-test="submit-email-button"]'; // Confirmed selector for the continue button
        await page.waitForSelector(continueButtonSelector, { timeout: 30000 });
        await page.click(continueButtonSelector);
        console.log("Continue button clicked...");

        // Step 5: Wait for the password input field
        const passwordInputSelector = 'input[name="password"]'; // Confirmed selector for password input
        await page.waitForSelector(passwordInputSelector, { timeout: 30000 });
        console.log("Password input field detected...");

        // Step 6: Enter password
        const password = 'Ajay7906@.com'; // Replace with your password
        await page.type(passwordInputSelector, password);
        console.log("Password entered...");

        // Step 7: Click on the "Sign In" button
        const signInButtonSelector = 'button[data-test="submit-password-button"]'; // Confirmed selector for the sign-in button
        await page.waitForSelector(signInButtonSelector, { timeout: 30000 });
        await page.click(signInButtonSelector);
        console.log("Sign In button clicked...");

        // Step 8: Wait for navigation to the main page
        await page.waitForNavigation({ waitUntil: 'networkidle2' });
        console.log("Login successful! Now on the main page.");

    } catch (error) {
        console.error("Error during login process:", error.message);
    } finally {
        // Step 9: Close the browser (optional)
        await browser.close();
    }
}

runAutomation();
