step 1:downloading git for windows(64/32bits)
step 2:create git hub account

step3:create a repository for your project
                    or
	 browse the repository for existing project get http:url for cloning into local system
step 4:create local folder for the repo
step 5:open git-bash and cd to local repo folder
step 6:execute git clone command with url as shown

       git clone https://github.com/neojobhunter001/001-coreJava-App
	   
step 7:cd project folder(to get project folder execute it)
step 8:create local branch for the remote repo

			git checkout-b prajwala java001_17_oct_2021
			
step 9:git latest changes form remote repo to local branch

           git pull
step 10:implement code changes
step 11:check status forchanges made in local branch

			git status 
step 12:add the changes to the staging repo/environment
						
				git add<filename with extension>
			    git add.(adds all the changes in the current directory to staging)
				git add*(all changes same as .)
step 13:check git status for made in local branch
				git status
step 14:commite the changes using
           git commite -m "message about the implementations done"
step 15:push the changes to main/master repo in git hub using 
		git push origin<local branch name>
		
step 16:take the url to create a pull request
step 17:open the url to browser to cre a pull request 
step 18:wait till the changes are merged by project owner
step 19:to get updated changes from the master repo to our local repo	
				
				git pull