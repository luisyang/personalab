#-------------------------------------------------------------------------------
# Name:        ģ��1
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
        shuffle(t)#ϴ�ƺ���������˳��
        self.thenum=t[0]*1000+t[1]*100+t[2]*10+t[3]
        print self.thenum
        while self.life>0:
            self.GetResults()
        if self.win :
            print "��Ӯ��"
        elif  self.flag:
            print "���˳���"
        else : print "������"
        return



    def GetResults(self):#�ж����
        self.life-=1#һ���ݼ����̣���һ�ζ�����life>0,����ֻ�ܲ�12��
        s1=raw_input('''������µ��Ǹ�����
��������Q����q�˳�
��������A����a�Զ���
''')
        if s1 in ['Q','q']:
            self.life=0
            self.flag=True
            return
        else:
            pass
        self.s1=s1
        w=self.getnum(s1)
        print s1,":",w[0],"a",w[1],"b"#������
        if w[1]==4:
            self.life=0
            self.win=1
            return
        return#return��Ӧ���ǳɹ�

    def getnum(self,x,n1=-1):#��������������a��b��ֵ��n1��ʲô���ã�
        if n1==-1:n1=self.thenum
        n1=str(n1)
        a=len(filter(lambda m,n=n1:m in n,str(x)))#��������
        b=len(filter(lambda m,n=n1,k=str(x):n.find(m)==k.find(m),str(x)))#λ������
        return [a,b]
def z91():
    '''**�˻�������Ϸ **
 �����Ϸ��Ϊ�� ����. �����������λ��
 ������һ����λ��,��λ��ֻ����1~9
 ����������������λ���м�������ȷ���Լ��м���λ����ȷ\n
 ��������Ǹ�����1234����µ���2354\n��ô�������ش�3a1b
 ��ʾ�������λ����3������ȷ���Լ���1����λ��Ҳ��ȷ\n '''
    e=caigame()
    e.start()
if __name__ == '__main__':
    z91()