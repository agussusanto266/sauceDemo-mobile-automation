# 📱 SauceDemo Mobile Automation

This project contains **Android mobile automation testing** for the SauceDemo application using **Katalon Studio**.

The main objective of this project is to automate functional test scenarios on an Android device or emulator.

---

## 🚀 Features

* ✅ Automated **Successful Login** test scenario
* ✅ Automated **Failed Login** scenario (if implemented)
* ✅ Well-structured Test Cases and Scripts
* ✅ Organized Mobile Object Repository
* ✅ Basic mobile testing configuration
* ✅ Includes the tested `.apk` file

---

## 🧠 Tech Stack

| Technology            | Purpose                   |
| --------------------- | ------------------------- |
| Katalon Studio        | Main automation framework |
| Groovy                | Scripting language        |
| Android / Appium      | Mobile execution engine   |
| SauceDemo Android App | System Under Test (SUT)   |

---

## 📁 Project Structure

```
├── Data Files/
├── Include/
├── Libs/
├── Object Repository/
├── Profiles/
├── Reports/
├── Scripts/
├── Test Cases/
├── settings/
└── SauceDemo-Mobile-Automation.prj
```

---

## 📌 Prerequisites

Before running the project, make sure you have:

1. Installed **Katalon Studio** (latest version recommended)
2. Installed **Android SDK** and ADB
3. Enabled **Developer Options & USB Debugging** (for real devices)
4. Configured an **Android Emulator** or connected a real device
5. The SauceDemo `.apk` file available (if not already included)

---

## ▶️ How to Run the Test

1. Clone this repository:

```bash
git clone https://github.com/agussusanto266/sauceDemo-mobile-automation.git
```

2. Open **Katalon Studio**
3. Select **Open Project**
4. Navigate to the cloned project folder
5. Open the desired test case
6. Click **Run** and select your Android device or emulator
7. View execution results in the **Reports** tab

---

## 📊 Test Reports

Execution reports are automatically generated and can be found in:

```
/Reports/
```

Reports include:

* Test step logs
* Execution status
* Failure details
* Screenshots (if test fails)

---

## 🛠 Best Practices

* Use a compatible Android version for the APK
* Maintain the Object Repository if UI elements change
* Use Profiles for environment configuration
* Add additional test cases to expand coverage

---

## 📬 Contribution

Feel free to fork this repository, submit pull requests, or create issues for improvements.
