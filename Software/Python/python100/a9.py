# -*- coding: cp936 -*-
from collections import deque
#�ھ���----���ı任
#��cȤζ��̡�69-77��
#21:49 2006-11-4
def z69():
    '''��������1��
ħ��ʦ,������һ���Ǻ�a����2�δ��ϵ�����2�ŷ�����
���£�Ȼ�󷭿��Ǻ�k��Ȼ���ٴ��ϵ�����3�ŷ�
������£��Ǻ�q����k����k�ţ����η�������
����a~1����ԭʼ������'''
    ss=13
    d = deque(range(1,ss+1))
    f=[1]*ss
    for i in range(ss):
        d.rotate(-(i%len(d)))
        f[d[0]-1]=i+1
        d.popleft()
    print f
def z70():
    '''��������2�� ħ��ʦ
������һ���Ǻ�a��Ȼ����ϵ�����2�ŷ������
�£�Ȼ�󷭿��Ǻ�k��Ȼ���ٴ��ϵ�����2�ŷ���
����£��Ǻ�q�����η������õ���a~1����a~1
����ԭʼ������ '''
    def pai(x):
        if x>13:
            ch='r'
            x-=13
        else:
            ch='b'
        return ch+str(x)
    ss=26
    d = deque(range(1,ss+1))
    f=[1]*ss
    f[0]=pai(1)
    d.popleft()
    for i in range(2,ss+1):
        d.rotate(-(2%len(d)))
        f[d[0]-1]=pai(i)
        d.popleft()
    print f
def z71():
#11�������һ������������ÿ����7���Ǹ��˾ͳ�������7�κ�ʣ����4����
    ss=11
    nn=4
    kk=7
    d = deque(range(1,ss+1))
    for i in range(kk):
        d.rotate(-((nn-1)%len(d)))
        print d.popleft()
    print d
def z72():
#4��3��3��5������ɼ�����ͬ�����ֱ��Ƕ��� 
    e=[]
    for i in range(5):
        for j in range(4):
            e+=[i*3+j*5]
    print set(e)
def ntom(x,size,mod):
    t=[0]*(size)
    j=0
    while x and j<size:
        x,t[j]=divmod(x,mod)
        j+=1
    return t
def z73():
    #������಻��ͬ������Ϊ23���������ɸ����������Ա�ʾ1~23�ڵ�ȫ����Ȼ�����������Ƕ���
    def h73(xx):
        t=[]
        n=5
        for nn in range(1,2**n):
            y=sum(map(lambda x,y:x*y,xx,ntom(nn,n,2)))
            t.append(y)
        return len(set(t))
    ss=23
    for i in range(ss):
        for j in range(i+1,ss):
            for m in range(j+1,ss):
                for n in range(m+1,ss):
                    kk=ss-i-j-m-n
                    if kk>n:
                        kt=[i,j,m,n,kk]
                        if h73(kt)==ss:
                            print kt
def z74():
    #������ʮ�����뱻ˤ���Ŀ飬ÿ�鶼�����������������Ŀ���Բ���1~40����һ������,�������ض���
    def h74(xx):
        t=[]
        n=4
        for nn in range(1,3**n):
            y=sum(map(lambda x,y:x*y,xx,ntom(nn,n,3)))
            t.append(y)
        return len(set(t))
    ss=40
    for i in range(ss):
        for j in range(i+1,ss):
            for m in range(j+1,ss):
		kk=ss-i-j-m
                if kk>m:
		    kt=[i,j,m,kk]
		    if h74(kt)==ss:
			print kt
def z75():
    '''10����Χ��һ�������ֶ���������һ��ʼ��{10,2,8,22,16,4,10,6,14,20}
������,���е������������������Ҫһ����Ȼ�����е���ͬʱ���Լ���һ������ұߵ��ˣ�
�ʼ��κ��ҵĶ����ĸ���һ�� '''
    d=deque([ 10, 2, 8, 22, 16, 4, 10, 6, 14, 20])
    print d
    while [d[0]]*10!=d:
        d=map(lambda x:x%2 and (x+1)/2 or x/2,d)
        d2=deque(d)
        d2.rotate(1)
        d=map(lambda x,y:x+y,d,d2)
        print d

def z76():
    #6������ѡ�����ɸ���,�������ǵĺ���ӽ�10,����ôѡ{3.1,1.7,2.0,5.3,0.9,7.2}
    m2=[3.1,1.7,2.0,5.3,0.9,7.2]
    m2=[x*10 for x in m2]
    n=6
    t=[]
    for nn in range(1,2**n):
        tt=ntom(nn,n,2)
        y=abs(sum(map(lambda x,y:x*y,m2,tt))-100)
        t+=[[y,tt]]
    t=filter(lambda x,y=min(t)[0]:x[0]<y+0.01,t)
    for i in  t:
        m=filter(lambda x:x,map(lambda x,y:x and y or 0,i[1],m2))
        print m
def z77():
    #��ˮ���⣺ĳ����12��ˮ����ƽ����Ϊ2��6��������ֻ��8����5����������Ϊ����Ҫ�����βſ��ԣ���ô��
    def nexts(a,b,c,d):
        tt=[]
        ke1=reduce(lambda x,y:x+y,map(lambda x:str(x),a))
        for i in range(0,3):
            if a[i]!=0:
                for j in range(0,3):
                    if i!=j and a[j]<b[j]:
                        m=[]+a
                        t=b[j]-a[j]
                        if m[i]>=t:
                            m[i]-=t
                            m[j]=b[j]
                        else:
                            m[j]+=m[i]
                            m[i]=0
                        if m  not in c:
                            tt+=[m]
                            ke=reduce(lambda x,y:x+y,map(lambda x:str(x),m))
                            d[ke]=ke1
        return tt
    a=[12,0,0]
    b=[12,8,5]
    dd=[a,b]
    ee={}
    t=nexts (a,b,dd,ee)
    dd+=t
    while 1:
        m=[]
        for i in t:
            m+=nexts(i,b,dd,ee)
        dd+=t
        t=m
        if [6,6,0] in t :break
    e=ee["660"]
    print [6,6,0]
    while e!='1200':
        print map(lambda x:int(x),list(e))
        e=ee[e]
    print [12,0,0]
        # raw_input('--> ')
if __name__ == '__main__':
    s=""
    for i in range(69,78):
        s+='z'+str(i)+'()\n'
    exec(s)
