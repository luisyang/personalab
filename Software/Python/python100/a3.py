# -*- coding: cp936 -*-
from math import sqrt
from time import time
#������----����Ȥ��
#��cȤζ��̡�18-29��
#21:43 2007-1-11
def z18():
    #��λ��Ϊ6���ҿ��� ��3���������ж��ٸ�
    print len(filter(lambda x: (x*10+6)%3==0,range(1,9999)))
def z19():
    '''һ������8����1�����õ��̱�8��Ҳ��1���ڶ���
                ���̱�8����7��������Ϊa����֪�������17
                ����4�����õ��̱�17����15����������a��2
                ������������Ƕ���'''
    x=19
    flag=0
    def g(x,y,z):
        d,v=divmod(x,y)
        return (v==z) and d or 0
    while(flag==0):
        x+=1
        x1=g(x,8,1)
        y1=g(x,17,4)
        if x1 and y1:
            x1=g(x1,8,1)
            y1=g(y1,17,15)
            if x1 and y1:
                x1=g(x1,8,7)
                if x1*2==y1:
                    flag=1
    print x
def z20():
    #һ�������߽��Ʊ�ʾ��abc�������ľŽ��Ʊ�ʾ��cba����������� ����
    t1=range(7)
    for i in t1[1:]:
        for j in t1:
            for m in t1:
                t=str(i)+str(j)+str(m)
                tt=str(m)+str(j)+str(i)
                if int(t,7)==int(tt,9):
                    print t
def hueiwen(x):
    t=""
    for i in reversed(str(x)):
        t+=i
    return int(t)
def z21():
    #һ�����ľű������Ļ�������������Ƕ���
    for x in range(1001,1999):
        if hueiwen(x)==9*x:
            print x
def z22():
    #95859��Ļ������Ƕ���
    x=95859
    while 1:
        x+=1
        if hueiwen(x)==x:
            print x
            break
def z23():
    rr=[]
    gg=lambda x: int(sqrt(x))**2==x
    for i in range(4,10):
        rr+=[list(str(i*i))]
    rr+=[list("00")]
    for i in rr[1:]:
        for j in rr:
            for m in rr:
                g=map(lambda x,y,z: int(x+y+z), i,j,m)
                if gg(g[0]) and gg(g[1]):
                    print g
def z24():
    def mihe(n):
        n=str(n)
        return sum(map(lambda x,y=len(n):int(x)**y,n))
    for i in range(100,999):
        if i==mihe(i):
            print i
def miny(m):
    if m%2==0:return 2
    for k in range(3,sqrt(m)+1,2):
        if m%k==0 :return k
    return m
def fenj(m):
    n=m
    y={}
    while n!=1:
        t=miny(n)
        if y.has_key(t):
            y[t]+=1
        else:
            y[t]=1
        n/=t
    return y
def addy(m):
    t=fenj(m)
    h=1
    for i in t.keys():
        if i==1:
            h*=i+1
        else:
            h*=(i**(t[i]+1)-1)/(i-1)
    return h-m
def z26():
    '''������������ͬ�����㷨400000�ڵ�c��python��18���Ĳ��'''
    y={}
    y[1]=0
    t1=time()
    for i in range(2,4000):
        t=addy(i)
        if t<i and y[t]==i:
            print i,t
        y[i]=t
    t2=time()
    print t2-t1

def z25():
    #÷ɭ����
    def isP(x):
        if x==2 :return True
        if x%2==0 :return False
        for n in range(3,sqrt(x),2):
            if x%n==0 :return False
        return True
    def isMP(x,y):
        n=4
        for i in range(x-2):
            n=(n*n-2)%y
        return not n

    for n in range(3,200,2):
        if isP(n) and isMP(n, (2**n)-1):
            print n
def auto27(n):
    '''������(Automorphic Number)��һ�������������
��ĩ��λ���ֵ��������������ʮ���ƣ�5��6
��25��76��376��625������������
��kλ���У������������������һ����λ����
Ϊ5����һ����λ����Ϊ6��
һ����ʽΪn=0(mod 2^k),n=1(mod 5^k) ����һ��
��ʽΪn=1(mod 2^k),n=0(mod 5^k) ����ͱض�Ϊ
10^k+1��'''
    if n==1 :return 6
    k=10**(n-1)
    p=auto27(n-1)
    for i in range(10):
        nn=i*k+p
        if nn%(2**n)==0 and nn%(5**n)==1:
            break
    return nn
def z27():
    print auto27(105)
def z28():
    for i in range(1,12000):
        n=i*i
        if n==hueiwen(n):
            print n
def z29():
    def g(n):
        s1=str(n)
        b=(int(s1[2:])+int(s1[:2]))**2
        return b
    for i in range(1000,9999):
        if g(i)==i:
            print i
if __name__ == '__main__':
    s=""
    for i in range(18,30):
        s+='z'+str(i)+'()\n'
    exec(s)
