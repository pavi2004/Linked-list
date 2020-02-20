class Node:
  def __init__(self,data):
    self.data=data
    self.next=None
class LinkedList:
  def __init__(self):
    self.head=None
  
  def insert(self,data):
    newnode=Node(data)
    if(self.head==None):
      self.head=newnode
      return
    temp=self.head
    while(temp.next):
      temp=temp.next
    temp.next=newnode
  
  def check(self):
    stack=[]
    temp=self.head
    while(temp):
      stack.append(temp.data)
      temp=temp.next
    temp=self.head
    while(temp):
      if(stack[-1]==temp.data):
        stack.pop()
      else:
        print("no")
        return
      temp=temp.next
    print("yes")

l=LinkedList()
n=int(input())
s=input().split()
for i in s:
  l.insert(i)
l.check()
  
