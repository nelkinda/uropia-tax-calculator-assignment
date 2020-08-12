import { Before, Given, Then, When } from "cucumber";
import { AppPage } from "../app.po";
import { element, by } from "protractor";
import { expect } from "chai";

let page: AppPage;

Before(() => {
  page = new AppPage();
});

Given('an empty shopping cart', async function() {
  await page.navigateTo();
})

Given('the shopping cart contains the following items:', async function (dataTable) {
  const rows = dataTable.rows
  // Write code here that turns the phrase above into concrete actions
  await page.navigateTo();
});

When('generating the bill', function () {
  // Write code here that turns the phrase above into concrete actions
  return 'pending';
});

Then('the {string} MUST be {float}', function (string, float) {
  // Write code here that turns the phrase above into concrete actions
  return 'pending';
});
