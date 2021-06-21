# Source Control

Add all of your code to your personal Capco GitHub account, you can find instructions on setting this up here - [Atlassian](https://ilabs-capco.atlassian.net/wiki/spaces/BPG/pages/812580874/Capco+Digital+Github+Organisation+Contributions). Have a read through [Trunk Based Development Docs](https://trunkbaseddevelopment.com/) to familiarise yourself with best practises for Capco.

## Task

* Create your Capco GitHub using your Capco email and four character Capco username e.g. github/cpcd-capco.com (instructions in the [Atlassian](https://ilabs-capco.atlassian.net/wiki/spaces/BPG/pages/812580874/Capco+Digital+Github+Organisation+Contributions) link).
* Ensure you follow the steps within the [Atlassian](https://ilabs-capco.atlassian.net/wiki/spaces/BPG/pages/812580874/Capco+Digital+Github+Organisation+Contributions) link to create signed commits.
* Create a new public repository within your Capco GitHub account **not** the Capco organisation account.
* Create a .gitignore file. This should include the names of any paths which should be excluded from source control (git, gradle, build files). Remember to consider hidden files.
* You can follow this tutorial to add the initial commit to git <https://help.github.com/articles/adding-an-existing-project-to-github-using-the-command-line/>
* Use **git status** to ensure that only the desired files are going to be committed and pushed.
* Note that you may have to run `git push -uf origin master`

to force the initial commit

![github](attachments/418971746/429096961.png?height=250)
