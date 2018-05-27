PlayGround

A Java project, initialized with Spring and Maven

Made for small side projects and testing...

The project can run in 3 different environments with different spring profiles
dev (default),test and prod(credentials as env parameters). 

Mini Projects:

- HashCodeAndEquals (equalandhash package)

	Made 2 classes and a test file to show why u should overwrite equals and hashCode
	when creating objects

- Checked and UnChecked exceptions (checkedandunchecked package)

	Created a simple checked and un checked exception to show usage differences.
	
- Testing with Mockito and Spring Boot (autowirefromtestmockito package)

    A test class testing a sample user class using autowire and mocks.

    Mockito and spring Boot

- Git aliases

      cm = commit -m
      
    	cb = checkout -b        #create branch and move to it
    	
    	st = status
    	
    	br = branch
    	
    	ms = merge --squash
    	
    	ch = checkout
    	
    	cam = commit -a -m      #add and commit same time
    	
    	clist = config --list   #show aliases list
    	
    	ap = add -p             #add section by section
    	
    	ds = diff --staged
    	
    	slist = stash list
    	
    	ssave = stash save
    	
    	brl = branch --list
    	
    	cmamne = commit --amend --no-edit
    	
    	#pull and rebase from updated branch
    	
    	rebasebr = "!f() { BR_NAME=$(git rev-parse --abbrev-ref HEAD); git checkout $1; git pull; git checkout $BR_NAME; git rebase $1; }; f"
    	
    	#force push the current branch
    	
    	pushfo = "!f() { BR_NAME=$(git rev-parse --abbrev-ref HEAD); git push -f origin $BR_NAME; }; f"
    	