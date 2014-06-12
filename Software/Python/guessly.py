#-------------------------------------------------------------------------------
# Name:        模块1
# Purpose:
#
# Author:      Administrator
#
# Created:     25-05-2013
# Copyright:   (c) Administrator 2013
# Licence:     <your licence>
#-------------------------------------------------------------------------------

from random import shuffle
class caigame:
    win=False
    flag=False
    life=12
    what=-1
    s1=''
    map1=[]
    thenum=0
    def start(self):
        t=range(1,10)
        shuffle(t)#洗牌函数，打乱顺序
        self.thenum=t[0]*1000+t[1]*100+t[2]*10+t[3]
        print self.thenum
        while self.life>0:
            self.GetResults()
        if self.win :
            print "你赢了"
        elif  self.flag:
            print "你退出了"
        else : print "你输了"
        return



    def GetResults(self):#判定结果
        self.life-=1#一个递减过程，上一段定义了life>0,所以只能猜12次
        s1=raw_input('''输入你猜的那个数字
或者输入Q或者q退出
或者输入A或者a自动猜
''')
        if s1 in ['Q','q']:
            self.life=0
            self.flag=True
            return
        else:
            pass
        self.s1=s1
        w=self.getnum(s1)
        print s1,":",w[0],"a",w[1],"b"#输出结果
        if w[1]==4:
            self.life=0
            self.win=1
            return
        return#return的应该是成功

    def getnum(self,x,n1=-1):#两个过滤器，算a和b的值，n1起什么作用？
        if n1==-1:n1=self.thenum
        n1=str(n1)
        a=len(filter(lambda m,n=n1:m in n,str(x)))#总数对上
        b=len(filter(lambda m,n=n1,k=str(x):n.find(m)==k.find(m),str(x)))#位数对上
        return [a,b]
def z91():
    '''**人机猜数游戏 **
 这个游戏是为了 猜数. 这个数字是四位数
 你输入一个四位数,各位数只能是1~9
 计算机告诉你这个四位数有几个数正确，以及有几个位置正确\n
 比如如果那个数是1234，你猜的是2354\n那么计算机会回答3a1b
 表示你这个四位数有3个数正确，以及有1个连位置也正确\n '''
    e=caigame()
    e.start()
if __name__ == '__main__':
    z91()