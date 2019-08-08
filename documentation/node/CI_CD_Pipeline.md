# CI/CD Pipeline

## Task

The task is to setup the CircleCI continuous integration tool to automatically build the Node.js application. 

-   Browse to circleci.com and login with your github account.
-   Give access to your account and setup the project which you added to git in the previous task. 
-   Follow the steps to create the project:

![](attachments/418840754/428867619.png?height=250)

-   Setup the ".circleci/config.yml" file and add the "circleci/mongo:3.6" as a dependency.
-   Add and push the file to git and ensure that your build runs successfully.

![](attachments/418840754/428769284.png?height=250)

-   Try removing the mongo dependency from your config.yml file. Push the change and ensure that your integration tests fail:

![](attachments/418840754/428834844.png?height=250)

-   Add the test results of the build to circleci <https://circleci.com/docs/1.0/test-metadata/#gradle-junit-results>
-   If the test results are written to your "build/test-results/" folder, you could add the following .yml to your config.yml file to achieve that:

>           - run:
>               name: Save test results
>               command: |
>                 mkdir -p ~/junit/
>                 find . -type f -regex ".*/build/test-results/.*xml" -exec cp {} ~/junit/ \;
>               when: always
>           - store_test_results:
>               path: ~/junit
>           - store_artifacts:
>               path: ~/junit 

![](attachments/418840754/428867631.png?height=250)


