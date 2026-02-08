# x9-utility
X9 Record Parser, Validator and Writer

# Getting Started

### Add Repo to Remote GITHUB Repository

> git init
> git remote add origin <path to remote repo>

### How to compile and run this project using gradle

You will need gradle 8.14 or 9.x

> ./gradlew wrapper --gradle-version 8.14

OR

>  ./gradlew clean

### Where to get Sample X9 Files

https://x9ware.com/test-file-downloads/

https://x9ware.com/wp-content/uploads/2022/07/Test-x937-dstu-Forward-Presentment-with-10-checks.zip

### How to write, run junit test and where to look for test reports

> ./gradlew clean test

reports are generated under build dir => build/reports/tests/test/index.html