# with open('test.txt', 'r') as f:
#     # f_contents = f.read()
#     # print(f_contents)
#     # f_contents2 = f.readlines()
#     # print(f_contents)
#     # print(f_contents2)
#     size = 10
#     f_contents = f.read(size)

with open('test.txt', 'w') as f:
    f.write('test')
    f.seek(0)
    f.write('R')