"""
Practical work 1: student mark management
• Functions
• Input functions:
• Input number of students in a class
• Input student information: id, name, DoB
• Input number of courses
• Input course information: id, name
• Select a course, input marks for student in this course
• Listing functions:
• List courses
• List students
• Show student marks for a given course
• Push your work to corresponding forked Github repository
"""


# create data storage

students = {}
courses = {}
marks = {}

def input_student():
    n = int(input("Enter number of student in a class: "))
    for _ in range(n):
        student_id = input("Student ID: ")
        student_name = input("Student name: ")
        dob = input("Date of Birth (DD/MM/YYYY): ")
        students[student_id] = {
            "student_name" : student_name,
            "DoB": dob
        }
        print("\n")
    print("Students added successfully\n")

def input_course():
    n = int(input("Enter number of course: "))
    for _ in range(n):
        course_id = input("Course ID: ")
        course_name = input("Course name: ")
        courses[course_id] = course_name
        marks[course_id] = {}
        print("\n")
    print("Courses added successfully\n")


def input_marks():
    if not courses:
        return
    course_id = input("Enter course id to input marks: ")

    if course_id not in courses:
        return
    for student_id in students:
        mark = float(input((f"Enter mark for {students[student_id]["student_name"]}: ")))
        marks[course_id][student_id] = mark
    print("Marks recorded successfully.\n")

def list_student():
    if not students:
        return
    
    print("List of student\n")
     
    for sid, sinfo in students.items():
        print(f"ID: {sid}, Student name: {sinfo['student_name']}, DoB: {sinfo['DoB']}")

    print("\n")

def list_course():
    if not courses:
        return
    print("List of course\n")
    for cid , course_name in courses.items():
        print(f"ID: {cid}, Course name: {course_name}")
    print("\n")

def show_mark_by_course():
    course_id = input("Enter course ID: ")
    if course_id not in courses:
        return 
    
    print(f"Marks for course: {courses[course_id]}")
    for student_id, mark in marks[course_id].items():
        print(f"{students[student_id]['student_name']}: {mark}")

    print("\n")

def main():
    input_student()
    input_course()
    input_marks()

    list_student()
    list_course()
    show_mark_by_course()


if __name__ == '__main__':
    main()