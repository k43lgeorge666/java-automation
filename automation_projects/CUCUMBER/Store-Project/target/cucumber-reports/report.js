$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginUser.feature");
formatter.feature({
  "line": 1,
  "name": "Login a user account",
  "description": "",
  "id": "login-a-user-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8142971600,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login for a user account is successfully completed",
  "description": "",
  "id": "login-a-user-account;login-for-a-user-account-is-successfully-completed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user open the web application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user selects My Account tab option",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the user selects the Login option",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the user provides email and password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the user should be logged successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginUserSteps.user_opens_the_webapp()"
});
formatter.result({
  "duration": 4010220100,
  "status": "passed"
});
formatter.match({
  "location": "LoginUserSteps.user_selects_my_account_option()"
});
formatter.result({
  "duration": 302908100,
  "status": "passed"
});
formatter.match({
  "location": "LoginUserSteps.user_selects_the_login_option()"
});
formatter.result({
  "duration": 429287100,
  "status": "passed"
});
formatter.match({
  "location": "LoginUserSteps.user_provides_credentials()"
});
formatter.result({
  "duration": 971793100,
  "status": "passed"
});
formatter.match({
  "location": "LoginUserSteps.user_should_be_logged()"
});
formatter.result({
  "duration": 11005800,
  "status": "passed"
});
formatter.after({
  "duration": 3371165200,
  "status": "passed"
});
formatter.uri("Register.feature");
formatter.feature({
  "line": 1,
  "name": "register new user",
  "description": "",
  "id": "register-new-user",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2722396900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "register for new user is successfully completed",
  "description": "",
  "id": "register-new-user;register-for-new-user-is-successfully-completed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user open the web page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user goes to my account tab",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the user selects the Register option",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the user provides the required information",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the user should be notified that the account was created",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterUserSteps.user_opens_the_web_app()"
});
formatter.result({
  "duration": 3485130600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUserSteps.user_goes_to_my_account_tab()"
});
formatter.result({
  "duration": 274564200,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUserSteps.user_selects_the_register_option()"
});
formatter.result({
  "duration": 880331200,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUserSteps.the_user_provides_the_required_information()"
});
formatter.result({
  "duration": 4290948300,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUserSteps.the_successful_message_should_be_displayed()"
});
formatter.result({
  "duration": 61296300,
  "status": "passed"
});
formatter.after({
  "duration": 3446011700,
  "status": "passed"
});
formatter.uri("UpdatePhone.feature");
formatter.feature({
  "line": 1,
  "name": "Update phone from a user account",
  "description": "",
  "id": "update-phone-from-a-user-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3162061100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Update the phone for a user account is successfully completed",
  "description": "",
  "id": "update-phone-from-a-user-account;update-the-phone-for-a-user-account-is-successfully-completed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user open the web Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user login into the web application",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the user selects the Edit Account option",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the user write the new phone number",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the phone number from the account should be updated",
  "keyword": "Then "
});
formatter.match({
  "location": "UpdatePhoneSteps.user_open_the_webapp()"
});
formatter.result({
  "duration": 3193494300,
  "status": "passed"
});
formatter.match({
  "location": "UpdatePhoneSteps.user_login_in_the_webapp()"
});
formatter.result({
  "duration": 1653491400,
  "status": "passed"
});
formatter.match({
  "location": "UpdatePhoneSteps.user_selects_Edit_Account_option()"
});
formatter.result({
  "duration": 1382409200,
  "status": "passed"
});
formatter.match({
  "location": "UpdatePhoneSteps.user_write_the_new_phone()"
});
formatter.result({
  "duration": 673311600,
  "status": "passed"
});
formatter.match({
  "location": "UpdatePhoneSteps.the_message_from_the_update_is_displayed()"
});
formatter.result({
  "duration": 31549600,
  "status": "passed"
});
formatter.after({
  "duration": 3053820600,
  "status": "passed"
});
});