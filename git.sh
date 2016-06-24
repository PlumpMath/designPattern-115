#/bin/bash
if [ ! -n $1 ];then
	echo "\033[31m please input your branch !!!! \033[0m"
	exit
elif [ ! -n $2 ];then
	echo ""\033[31m please input your commit message !!!! \033[0m""
else
	git add -A && git commit -m $2 && git pull origin $1 && git push origin $1
fi
