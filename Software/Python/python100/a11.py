# -*- coding: cp936 -*-
#��ʮһ��----������Ϸ
#��cȤζ��̡�86-93��
#21:39 2007-1-23
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
        shuffle(t)
        self.thenum=t[0]*1000+t[1]*100+t[2]*10+t[3]
        self.inmap()
        print self.thenum
        while self.life>0:
            self.GetResults()
        if self.win :
            print "��Ӯ��"
        elif  self.flag:
            print "���˳���"
        else : print "������"
        return
    def GetResults(self):
        self.life-=1
        s1=raw_input('''������µ��Ǹ�����
��������Q����q�˳�
��������A����a�Զ���
''')
        if s1 in ['Q','q']:
            self.life=0
            self.flag=True
            return
        elif s1 in ['A','a']:
            s1= self.autodo()
        else:
            pass
        self.s1=s1
        w=self.getnum(s1)
        self.what=w
        print s1,":",w[0],"a",w[1],"b"
        if w[1]==4:
            self.life=0
            self.win=1
            return
        return
    def getnum(self,x,n1=-1):
        if n1==-1:n1=self.thenum
        n1=str(n1)
        a=len(filter(lambda m,n=n1:m in n,str(x)))
        b=len(filter(lambda m,n=n1,k=str(x):n.find(m)==k.find(m),str(x)))
        return [a,b]
    def inmap (self):
        r={}
        t=range(1,10)
        for i in t:
            for j in t:
                for m in t:
                    for n in t:
                        if i!=j!=m!=n!=i and j!=n and m!=i:
                            r[int(str(i)+str(j)+str(m)+str(n))]=1
        self.map1=r.keys()
        self.map1.sort()
        return
    def autodo(self):
        if self.what!=-1:
            self.map1=filter(lambda m,n=self.what,k=self.getnum ,ttt=self.s1:
                             n==k(ttt,m),self.map1)
        #if len(self.map1)<9 :print self.map1
        if self.map1[0]!=self.s1:
            return self.map1[0]
        else:
            return self.map1[-1]

def z86():
    #ϴ�Ʒ���
    t=[]
    def g(x):
        sh,yu=divmod(x,13)
        return [sh,yu]
    def g2(x,y):
        t=[]
        s1=["2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"]
        for i in x:
            if i[0]==y:
                t+=[i[1]]
        t.sort()
        t=map(lambda m,n=s1:n[m],t)
        return t
    s2=[u"����", u"����", u"��Ƭ", u"�ݻ�"]
    s3=[u"��",u"��",u"��",u"��"]
    t=range(52)
    shuffle(t)
    t=map(g,t)
    t=t[:13],t[13:26],t[26:39],t[39:]
    m=range(4);
    for i in m:
        print s3[i]
        for j in m:
            print s2[j],g2(t[i],j)
    print
def z93():
    ''' ** ��ŵ����Ϸ ** 
     �����Ϸ��Ϊ���ƶ�һ���� 
     ������һ��С��,�����ֻ����2~7 
     ������������Ĳ���\n 
     ��һ��ľ��������������\n����ߵĸ���
        ���϶��£���С������n�����\n����Ϸ��Ŀ����
        ������ߵĸ����ϵ����ƶ�������\n�ߵĸ����ϣ�
        ������һ��ֻ���ƶ�һ���̣�\n���Ҳ�������̷���С���ϡ�;
     �������2~7������κ��ַ���ôn=4\n '''
    def g(x,y):
        s4=x==1 and ' '*7 or '' 
        s3="-"* (abs(x-y)==2 and 12 or 5)
        s3= x>y and s3+">" or "<"+s3
        print s4+str(x)+s3+str(y)
        return
    def move(n,z,m,y):
        if n>0:
            move(n-1,z,y,m)
            g(z,m)
            move(n-1,y,m,z)
        return
    t=raw_input("�����Ǹ����Ĳ���")
    t=int(t)
    if not 8>t>1:t=4
    move(t,0,2,1)
    return
def z91():
    '''**�˻�������Ϸ ** 
 �����Ϸ��Ϊ�� ����. �����������λ�� 
 ������һ����λ��,��λ��ֻ����1~9 
 ����������������λ���м�������ȷ���Լ��м���λ����ȷ\n 
 ��������Ǹ�����1234����µ���2354\n��ô�������ش�3a1b 
 ��ʾ�������λ����3������ȷ���Լ���1����λ��Ҳ��ȷ\n '''
    e=caigame()
    e.start()
def z87():
    #�ڰ��ӽ���
    def nex(x):
        if '012' in x:return x.replace('012','210')
        if '120' in x:return x.replace('120','021')
        if '10' in x and '2102' not in x:return x.replace('10','01')
        if '02' in x and '1021' not in x:return x.replace('02','20')
        return
    n=4
    t,r='1'*n,'2'*n
    x=t+'0'+r
    s=r+'0'+t
    while x!=s:
        print x
        x=nex(x)
    print s
if __name__ == '__main__':
    z91()
    #z93()
