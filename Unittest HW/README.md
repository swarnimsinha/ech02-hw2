Open log.json with notepad or any other text editor. You will find that the interactive and complete lifecycle of the test has passed successfully.

The AWS Testing contains the following folders describing two types of test runs:

- Automated test run: Here we use the AWS device farm and create a device pool to test our app on.

  - The automated test runs are done on 4 devices. The test being carried out is the built in Fuzz test.
  - Interpretation:

    - I am using the Amazon's AWS to generate and analyze the test reports.
    - In my testing, the test failed at a certain step in 2 out of the 3 devices.
    - Google Pixel 2: The device was unavailable and skipped
    - Google Pixel : Exerciser detected crash: java.lang.IllegalStateException: A fatal developer error has occurred. Check the logs for further information.


_Monkey Test_

- The application is tested by random screen clicks. It tests whether the page is responsive and returns in its log the argument errors and exceptions are thrown in the process.
- The monkey test is done on android studio.

_Test Cases:_

- The excel test cases contains manual test case scenarios which were tested on a physical One Plus 3T and on a Virtual Google Nexus Device on an emulator.

We notice that the memory, network and CPU usage increase in the first instances of the activities (Register, Storage and upload) , but they do not increase dramatically on repeated executions of these activities.
