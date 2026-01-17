"""
• Copy your practical work 1 to 2.student.mark.oop.py
• Make it OOP’ed
• Same functions
• Proper attributes and methods
• Proper encapsulation
• Proper polymorphism
• e.g. .input(), .list() methods
• Push your work to corresponding forked Github repository"""


class Person:
    def input(self):
        pass
    def list(self):
        pass

class Student(Person):
    def __init__(self):
        self.__sid = ""
        self.__sname = ""
        self.__dob = ""

    def input(self):
        self.__id = input("Enter student id: ")
        self.__sname = input("Enter student name: ")
        self.__dob = input("Enter date of birth: ")

    def list(self):
        print(f"Student name: {self.__sname}, id: {self.__sid}, DoB: {self.__dob}")

    def get_name(self):
        return self.__sname

    def get_id(self):
        return self.__id
    
class Course:
    def __init__(self):
        self.__cid = ""
        self.__cname = ""
        self.__marks = {} #student id mark

    def input(self):
        self.__cid = input("Enter Course id: ")
        self.__cname = input("Enter course name: ")
    
    def list(self):
        print(f"Course name: {self.__cname}, id: {self.__cid}")

    def get_id(self):
        return self.__cid
    def get_name(self):
        return self.__cname
    
    def input_marks(self, students):
        for st in students:
            mark = float(input(f"Enter mark for {st.get_name()}: "))
            self.__marks[st.get_id()] = mark

    def show_marks(self, students):

        for st in students:
            if st.get_id() in self.__marks:
                print(f"{st.get_name()}: {self.__marks[st.get_id()]}")

class management:
    def __init__(self):
        self.__students = []
        self.__courses = []

    def input_student(self):
        n = int(input("Enter number of students: "))
        for i in range(n):
            student = Student()
            student.input()
            self.__students.append(student)
        print("Student added!!")
    
    def input_course(self):
        n = int(input("Enter number courses: "))
        for i in range(n):
            course = Course()
            course.input()
            self.__courses.append(course)

        print("Course added!!!")

    def list_student(self):
        if not self.__students:
            return
        print(f"List of student")
        for st in self.__students:
            st.list()
        print()

    def list_course(self):
        if not self.__courses:
            return 
        print("List of courses")
        for c in self.__courses:
            c.list()
        print()

    def input_mark(self):
        cid = input("Enter course id: ")
        for course in self.__courses:
            if course.get_id() == cid:
                course.input_marks(self.__students)
                print("Mark done")
                return 
            
    def list_mark(self):
        cid = input("Enter course id: ")
        for course in self.__courses:
            if course.get_id() == cid:
                course.show_marks(self.__students)
                return 
            print()

def main():
    m = management()
    m.input_student()
    m.input_course()
    
    m.list_student()
    m.list_course()
    m.input_mark()
    m.list_mark()

if __name__ == '__main__':
    main()