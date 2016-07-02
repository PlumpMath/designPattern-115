#!/usr/bin/env bash
# author: lzh
curr=`pwd`
echo 'scaning '
find -name "*.java" > "source.txt"
echo "scan finish"
javasource=`cat source.txt`
echo 'compiling'
javac -source 1.8 -target 1.8  -d out $javasource -Xlint:unchecked
echo 'compile  finish'
echo 'remove source.txt'
rm source.txt
