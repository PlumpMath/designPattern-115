#!/usr/bin/env bash
# author: lzh
curr=`pwd`
echo 'scaning '
file=`find -name "*.java"`
echo "scan finish"
echo 'compiling'
javac -source 1.8 -target 1.8  -d out $file -Xlint:unchecked
echo 'compile  finish'
