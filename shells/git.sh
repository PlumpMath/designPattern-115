#/bin/bash
if test -z $1 ;then
	echo "\033[31m please input your branch !!!! \033[0m"
	exit 1
else
	if  test -z $2 ;then 
		git add -A && git commit  && git pull origin $1 && git push origin $1
		exit 0
	else
		git add -A && git commit -m $2  && git pull origin $1 && git push origin $1
	fi
	exit 0
fi
