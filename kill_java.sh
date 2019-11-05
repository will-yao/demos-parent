ps -ef | grep java | grep -v grep | awk '{print $2}' | xargs kill -9

#1.   Linux查看所有Java进程
#ps -ef | grep java | grep -v grep 
#(是在列出的进程中去除含有关键字"grep"的进程)
#2. 使用awk分割结果，获取PID
#awk '{print $2}'
#ps -ef | grep java | grep -v grep | awk '{print $2}'
#3. 杀死进程 kill -9 PID
#xargs 作用是将参数列表转换成小块分段传递给其他命令，以避免参数列表过长的问题
