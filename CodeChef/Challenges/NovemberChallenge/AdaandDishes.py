t = int(input())
for _ in range(t):
    n = int(input())
    arr = list(map(int,input().split()))
    arr.sort(reverse=True)
    #print(arr)
    if n == 1:
        print(arr[0])
    else:
        no1 = arr[0]
        no2 = arr[1]
        for i in range(2,n):
            if no1<=no2:
                no1+=arr[i]
            else:
                no2+=arr[i]
        if no1>=no2:
            print(no1)
        else:
            print(no2)
