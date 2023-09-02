import time
while 1:
    a = int(input("Enter the semester till which you want to calculate the CGPA="))
    r1: float = 0.0
    r2: float = 0.0
    r3: float = 0.0
    r4: float = 0.0
    r5: float = 0.0
    r6: float = 0.0
    r7: float = 0.0
    r8: float = 0.0
    for n in range(1, a+1):
        print("Semester=", n)
        if n == 1:
            c1 = 4
            c2 = 4
            c3 = 3
            c4 = 3
            c5 = 3
            c6 = 1
            c7 = 1
            c8 = 1
            m1 = float(input("Enter the marks of 18MAT11="))
            m2 = float(input("Enter the marks of 18CHE12="))
            m3 = float(input("Enter the marks of 18CPS13="))
            m4 = float(input("Enter the marks of 18ELN14="))
            m5 = float(input("Enter the marks of 18ME15="))
            m6 = float(input("Enter the marks of 18CHEL16="))
            m7 = float(input("Enter the marks of 18CPL17="))
            m8 = float(input("Enter the marks of 18EGH18="))
            if m1 >= 90:
                m1 = 10
            elif m1 >= 80:
                m1 = 9
            elif m1 >= 70:
                m1 = 8
            elif m1 >= 60:
                m1 = 7
            elif m1 >= 50:
                m1 = 6
            elif m1 >= 40:
                m1 = 5
            elif m1 >= 30:
                m1 = 4
            elif m1 >= 20:
                m1 = 3
            elif m1 >= 10:
                m1 = 2
            elif m1 > 0:
                m1 = 1
            if m2 >= 90:
                m2 = 10
            elif m2 >= 80:
                m2 = 9
            elif m2 >= 70:
                m2 = 8
            elif m2 >= 60:
                m2 = 7
            elif m2 >= 50:
                m2 = 6
            elif m2 >= 40:
                m2 = 5
            elif m2 >= 30:
                m2 = 4
            elif m2 >= 20:
                m2 = 3
            elif m2 >= 10:
                m2 = 2
            elif m2 > 0:
                m2 = 1
            if m3 >= 90:
                m3 = 10
            elif m3 >= 80:
                m3 = 9
            elif m3 >= 70:
                m3 = 8
            elif m3 >= 60:
                m3 = 7
            elif m3 >= 50:
                m3 = 6
            elif m3 >= 40:
                m3 = 5
            elif m3 >= 30:
                m3 = 4
            elif m3 >= 20:
                m3 = 3
            elif m3 >= 10:
                m3 = 2
            elif m3 > 0:
                m3 = 1
            if m4 >= 90:
                m4 = 10
            elif m4 >= 80:
                m4 = 9
            elif m4 >= 70:
                m4 = 8
            elif m4 >= 60:
                m4 = 7
            elif m4 >= 50:
                m4 = 6
            elif m4 >= 40:
                m4 = 5
            elif m4 >= 30:
                m4 = 4
            elif m4 >= 20:
                m4 = 3
            elif m4 >= 10:
                m4 = 2
            elif m4 > 0:
                m4 = 1
            if m5 >= 90:
                m5 = 10
            elif m5 >= 80:
                m5 = 9
            elif m5 >= 70:
                m5 = 8
            elif m5 >= 60:
                m5 = 7
            elif m5 >= 50:
                m5 = 6
            elif m5 >= 40:
                m5 = 5
            elif m5 >= 30:
                m5 = 4
            elif m5 >= 20:
                m5 = 3
            elif m5 >= 10:
                m5 = 2
            elif m5 > 0:
                m5 = 1
            if m6 >= 90:
                m6 = 10
            elif m6 >= 80:
                m6 = 9
            elif m6 >= 70:
                m6 = 8
            elif m6 >= 60:
                m6 = 7
            elif m6 >= 50:
                m6 = 6
            elif m6 >= 40:
                m6 = 5
            elif m6 >= 30:
                m6 = 4
            elif m6 >= 20:
                m6 = 3
            elif m6 >= 10:
                m6 = 2
            elif m6 > 0:
                m6 = 1
            if m7 >= 90:
                m7 = 10
            elif m7 >= 80:
                m7 = 9
            elif m7 >= 70:
                m7 = 8
            elif m7 >= 60:
                m7 = 7
            elif m7 >= 50:
                m7 = 6
            elif m7 >= 40:
                m7 = 5
            elif m7 >= 30:
                m7 = 4
            elif m7 >= 20:
                m7 = 3
            elif m7 >= 10:
                m7 = 2
            elif m7 > 0:
                m7 = 1
            if m8 >= 90:
                m8 = 10
            elif m8 >= 80:
                m8 = 9
            elif m8 >= 70:
                m8 = 8
            elif m8 >= 60:
                m8 = 7
            elif m8 >= 50:
                m8 = 6
            elif m8 >= 40:
                m8 = 5
            elif m8 >= 30:
                m8 = 4
            elif m8 >= 20:
                m8 = 3
            elif m8 >= 10:
                m8 = 2
            elif m8 > 0:
                m8 = 1
            n1: float = ((c1 * m1) + (c2 * m2) + (c3 * m3) + (c4 * m4) + (c5 * m5) + (c6 * m6) + (c7 * m7) + (c8 * m8))
            d: float = (c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8)
            r1 = n1 / d
            print("")
            print("SGPA for First Semester = ", r1)
        if n == 2:
            c1 = 4
            c2 = 4
            c3 = 3
            c4 = 3
            c5 = 3
            c6 = 1
            c7 = 1
            c8 = 1
            m1 = float(input("Enter the marks of 18MAT21="))
            m2 = float(input("Enter the marks of 18PHY22="))
            m3 = float(input("Enter the marks of 18ELE23="))
            m4 = float(input("Enter the marks of 18CIV24="))
            m5 = float(input("Enter the marks of 18EGDL25="))
            m6 = float(input("Enter the marks of 18PHYL26="))
            m7 = float(input("Enter the marks of 18ELEL27="))
            m8 = float(input("Enter the marks of 18EGH28="))
            if m1 >= 90:
                m1 = 10
            elif m1 >= 80:
                m1 = 9
            elif m1 >= 70:
                m1 = 8
            elif m1 >= 60:
                m1 = 7
            elif m1 >= 50:
                m1 = 6
            elif m1 >= 40:
                m1 = 5
            elif m1 >= 30:
                m1 = 4
            elif m1 >= 20:
                m1 = 3
            elif m1 >= 10:
                m1 = 2
            elif m1 > 0:
                m1 = 1
            if m2 >= 90:
                m2 = 10
            elif m2 >= 80:
                m2 = 9
            elif m2 >= 70:
                m2 = 8
            elif m2 >= 60:
                m2 = 7
            elif m2 >= 50:
                m2 = 6
            elif m2 >= 40:
                m2 = 5
            elif m2 >= 30:
                m2 = 4
            elif m2 >= 20:
                m2 = 3
            elif m2 >= 10:
                m2 = 2
            elif m2 > 0:
                m2 = 1
            if m3 >= 90:
                m3 = 10
            elif m3 >= 80:
                m3 = 9
            elif m3 >= 70:
                m3 = 8
            elif m3 >= 60:
                m3 = 7
            elif m3 >= 50:
                m3 = 6
            elif m3 >= 40:
                m3 = 5
            elif m3 >= 30:
                m3 = 4
            elif m3 >= 20:
                m3 = 3
            elif m3 >= 10:
                m3 = 2
            elif m3 > 0:
                m3 = 1
            if m4 >= 90:
                m4 = 10
            elif m4 >= 80:
                m4 = 9
            elif m4 >= 70:
                m4 = 8
            elif m4 >= 60:
                m4 = 7
            elif m4 >= 50:
                m4 = 6
            elif m4 >= 40:
                m4 = 5
            elif m4 >= 30:
                m4 = 4
            elif m4 >= 20:
                m4 = 3
            elif m4 >= 10:
                m4 = 2
            elif m4 > 0:
                m4 = 1
            if m5 >= 90:
                m5 = 10
            elif m5 >= 80:
                m5 = 9
            elif m5 >= 70:
                m5 = 8
            elif m5 >= 60:
                m5 = 7
            elif m5 >= 50:
                m5 = 6
            elif m5 >= 40:
                m5 = 5
            elif m5 >= 30:
                m5 = 4
            elif m5 >= 20:
                m5 = 3
            elif m5 >= 10:
                m5 = 2
            elif m5 > 0:
                m5 = 1
            if m6 >= 90:
                m6 = 10
            elif m6 >= 80:
                m6 = 9
            elif m6 >= 70:
                m6 = 8
            elif m6 >= 60:
                m6 = 7
            elif m6 >= 50:
                m6 = 6
            elif m6 >= 40:
                m6 = 5
            elif m6 >= 30:
                m6 = 4
            elif m6 >= 20:
                m6 = 3
            elif m6 >= 10:
                m6 = 2
            elif m6 > 0:
                m6 = 1
            if m7 >= 90:
                m7 = 10
            elif m7 >= 80:
                m7 = 9
            elif m7 >= 70:
                m7 = 8
            elif m7 >= 60:
                m7 = 7
            elif m7 >= 50:
                m7 = 6
            elif m7 >= 40:
                m7 = 5
            elif m7 >= 30:
                m7 = 4
            elif m7 >= 20:
                m7 = 3
            elif m7 >= 10:
                m7 = 2
            elif m7 > 0:
                m7 = 1
            if m8 >= 90:
                m8 = 10
            elif m8 >= 80:
                m8 = 9
            elif m8 >= 70:
                m8 = 8
            elif m8 >= 60:
                m8 = 7
            elif m8 >= 50:
                m8 = 6
            elif m8 >= 40:
                m8 = 5
            elif m8 >= 30:
                m8 = 4
            elif m8 >= 20:
                m8 = 3
            elif m8 >= 10:
                m8 = 2
            elif m8 > 0:
                m8 = 1
            n1: float = ((c1 * m1) + (c2 * m2) + (c3 * m3) + (c4 * m4) + (c5 * m5) + (c6 * m6) + (c7 * m7) + (c8 * m8))
            d: float = (c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8)
            r2 = n1 / d
            print("")
            print("SGPA for Second Semester=", r2)
        if n == 3:
            c1 = 3
            c2 = 4
            c3 = 3
            c4 = 3
            c5 = 3
            c6 = 3
            c7 = 2
            c8 = 2
            c9 = 1
            m1 = float(input("Enter the marks of 18MAT31="))
            m2 = float(input("Enter the marks of 18EC32="))
            m3 = float(input("Enter the marks of 18EC33="))
            m4 = float(input("Enter the marks of 18EC34="))
            m5 = float(input("Enter the marks of 18EC35="))
            m6 = float(input("Enter the marks of 18EC36="))
            m7 = float(input("Enter the marks of 18ECL37="))
            m8 = float(input("Enter the marks of 18ECL38="))
            m9 = float(input("Enter the marks of 18KAK39="))
            if m1 >= 90:
                m1 = 10
            elif m1 >= 80:
                m1 = 9
            elif m1 >= 70:
                m1 = 8
            elif m1 >= 60:
                m1 = 7
            elif m1 >= 50:
                m1 = 6
            elif m1 >= 40:
                m1 = 5
            elif m1 >= 30:
                m1 = 4
            elif m1 >= 20:
                m1 = 3
            elif m1 >= 10:
                m1 = 2
            elif m1 > 0:
                m1 = 1
            if m2 >= 90:
                m2 = 10
            elif m2 >= 80:
                m2 = 9
            elif m2 >= 70:
                m2 = 8
            elif m2 >= 60:
                m2 = 7
            elif m2 >= 50:
                m2 = 6
            elif m2 >= 40:
                m2 = 5
            elif m2 >= 30:
                m2 = 4
            elif m2 >= 20:
                m2 = 3
            elif m2 >= 10:
                m2 = 2
            elif m2 > 0:
                m2 = 1
            if m3 >= 90:
                m3 = 10
            elif m3 >= 80:
                m3 = 9
            elif m3 >= 70:
                m3 = 8
            elif m3 >= 60:
                m3 = 7
            elif m3 >= 50:
                m3 = 6
            elif m3 >= 40:
                m3 = 5
            elif m3 >= 30:
                m3 = 4
            elif m3 >= 20:
                m3 = 3
            elif m3 >= 10:
                m3 = 2
            elif m3 > 0:
                m3 = 1
            if m4 >= 90:
                m4 = 10
            elif m4 >= 80:
                m4 = 9
            elif m4 >= 70:
                m4 = 8
            elif m4 >= 60:
                m4 = 7
            elif m4 >= 50:
                m4 = 6
            elif m4 >= 40:
                m4 = 5
            elif m4 >= 30:
                m4 = 4
            elif m4 >= 20:
                m4 = 3
            elif m4 >= 10:
                m4 = 2
            elif m4 > 0:
                m4 = 1
            if m5 >= 90:
                m5 = 10
            elif m5 >= 80:
                m5 = 9
            elif m5 >= 70:
                m5 = 8
            elif m5 >= 60:
                m5 = 7
            elif m5 >= 50:
                m5 = 6
            elif m5 >= 40:
                m5 = 5
            elif m5 >= 30:
                m5 = 4
            elif m5 >= 20:
                m5 = 3
            elif m5 >= 10:
                m5 = 2
            elif m5 > 0:
                m5 = 1
            if m6 >= 90:
                m6 = 10
            elif m6 >= 80:
                m6 = 9
            elif m6 >= 70:
                m6 = 8
            elif m6 >= 60:
                m6 = 7
            elif m6 >= 50:
                m6 = 6
            elif m6 >= 40:
                m6 = 5
            elif m6 >= 30:
                m6 = 4
            elif m6 >= 20:
                m6 = 3
            elif m6 >= 10:
                m6 = 2
            elif m6 > 0:
                m6 = 1
            if m7 >= 90:
                m7 = 10
            elif m7 >= 80:
                m7 = 9
            elif m7 >= 70:
                m7 = 8
            elif m7 >= 60:
                m7 = 7
            elif m7 >= 50:
                m7 = 6
            elif m7 >= 40:
                m7 = 5
            elif m7 >= 30:
                m7 = 4
            elif m7 >= 20:
                m7 = 3
            elif m7 >= 10:
                m7 = 2
            elif m7 > 0:
                m7 = 1
            if m8 >= 90:
                m8 = 10
            elif m8 >= 80:
                m8 = 9
            elif m8 >= 70:
                m8 = 8
            elif m8 >= 60:
                m8 = 7
            elif m8 >= 50:
                m8 = 6
            elif m8 >= 40:
                m8 = 5
            elif m8 >= 30:
                m8 = 4
            elif m8 >= 20:
                m8 = 3
            elif m8 >= 10:
                m8 = 2
            elif m8 > 0:
                m8 = 1
            if m9 >= 90:
                m9 = 10
            elif m9 >= 80:
                m9 = 9
            elif m9 >= 70:
                m9 = 8
            elif m9 >= 60:
                m9 = 7
            elif m9 >= 50:
                m9 = 6
            elif m9 >= 40:
                m9 = 5
            elif m9 >= 30:
                m9 = 4
            elif m9 >= 20:
                m9 = 3
            elif m9 >= 10:
                m9 = 2
            elif m9 > 0:
                m9 = 1
            n1: float = ((c1 * m1) + (c2 * m2) + (c3 * m3) + (c4 * m4) + (c5 * m5) + (c6 * m6) + (c7 * m7) + (c8 * m8) +
                         (c9 * m9))
            d: float = (c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9)
            r3 = n1 / d
            print("")
            print("SGPA for Third Semester=", r3)
        if n == 4:
            c1 = 3
            c2 = 4
            c3 = 3
            c4 = 3
            c5 = 3
            c6 = 3
            c7 = 2
            c8 = 2
            c9 = 1
            m1 = float(input("Enter the marks of 18MAT41="))
            m2 = float(input("Enter the marks of 18EC42="))
            m3 = float(input("Enter the marks of 18EC43="))
            m4 = float(input("Enter the marks of 18EC44="))
            m5 = float(input("Enter the marks of 18EC45="))
            m6 = float(input("Enter the marks of 18EC46="))
            m7 = float(input("Enter the marks of 18ECL47="))
            m8 = float(input("Enter the marks of 18ECL48="))
            m9 = float(input("Enter the marks of 18CPC49="))
            if m1 >= 90:
                m1 = 10
            elif m1 >= 80:
                m1 = 9
            elif m1 >= 70:
                m1 = 8
            elif m1 >= 60:
                m1 = 7
            elif m1 >= 50:
                m1 = 6
            elif m1 >= 40:
                m1 = 5
            elif m1 >= 30:
                m1 = 4
            elif m1 >= 20:
                m1 = 3
            elif m1 >= 10:
                m1 = 2
            elif m1 > 0:
                m1 = 1
            if m2 >= 90:
                m2 = 10
            elif m2 >= 80:
                m2 = 9
            elif m2 >= 70:
                m2 = 8
            elif m2 >= 60:
                m2 = 7
            elif m2 >= 50:
                m2 = 6
            elif m2 >= 40:
                m2 = 5
            elif m2 >= 30:
                m2 = 4
            elif m2 >= 20:
                m2 = 3
            elif m2 >= 10:
                m2 = 2
            elif m2 > 0:
                m2 = 1
            if m3 >= 90:
                m3 = 10
            elif m3 >= 80:
                m3 = 9
            elif m3 >= 70:
                m3 = 8
            elif m3 >= 60:
                m3 = 7
            elif m3 >= 50:
                m3 = 6
            elif m3 >= 40:
                m3 = 5
            elif m3 >= 30:
                m3 = 4
            elif m3 >= 20:
                m3 = 3
            elif m3 >= 10:
                m3 = 2
            elif m3 > 0:
                m3 = 1
            if m4 >= 90:
                m4 = 10
            elif m4 >= 80:
                m4 = 9
            elif m4 >= 70:
                m4 = 8
            elif m4 >= 60:
                m4 = 7
            elif m4 >= 50:
                m4 = 6
            elif m4 >= 40:
                m4 = 5
            elif m4 >= 30:
                m4 = 4
            elif m4 >= 20:
                m4 = 3
            elif m4 >= 10:
                m4 = 2
            elif m4 > 0:
                m4 = 1
            if m5 >= 90:
                m5 = 10
            elif m5 >= 80:
                m5 = 9
            elif m5 >= 70:
                m5 = 8
            elif m5 >= 60:
                m5 = 7
            elif m5 >= 50:
                m5 = 6
            elif m5 >= 40:
                m5 = 5
            elif m5 >= 30:
                m5 = 4
            elif m5 >= 20:
                m5 = 3
            elif m5 >= 10:
                m5 = 2
            elif m5 > 0:
                m5 = 1
            if m6 >= 90:
                m6 = 10
            elif m6 >= 80:
                m6 = 9
            elif m6 >= 70:
                m6 = 8
            elif m6 >= 60:
                m6 = 7
            elif m6 >= 50:
                m6 = 6
            elif m6 >= 40:
                m6 = 5
            elif m6 >= 30:
                m6 = 4
            elif m6 >= 20:
                m6 = 3
            elif m6 >= 10:
                m6 = 2
            elif m6 > 0:
                m6 = 1
            if m7 >= 90:
                m7 = 10
            elif m7 >= 80:
                m7 = 9
            elif m7 >= 70:
                m7 = 8
            elif m7 >= 60:
                m7 = 7
            elif m7 >= 50:
                m7 = 6
            elif m7 >= 40:
                m7 = 5
            elif m7 >= 30:
                m7 = 4
            elif m7 >= 20:
                m7 = 3
            elif m7 >= 10:
                m7 = 2
            elif m7 > 0:
                m7 = 1
            if m8 >= 90:
                m8 = 10
            elif m8 >= 80:
                m8 = 9
            elif m8 >= 70:
                m8 = 8
            elif m8 >= 60:
                m8 = 7
            elif m8 >= 50:
                m8 = 6
            elif m8 >= 40:
                m8 = 5
            elif m8 >= 30:
                m8 = 4
            elif m8 >= 20:
                m8 = 3
            elif m8 >= 10:
                m8 = 2
            elif m8 > 0:
                m8 = 1
            if m9 >= 90:
                m9 = 10
            elif m9 >= 80:
                m9 = 9
            elif m9 >= 70:
                m9 = 8
            elif m9 >= 60:
                m9 = 7
            elif m9 >= 50:
                m9 = 6
            elif m9 >= 40:
                m9 = 5
            elif m9 >= 30:
                m9 = 4
            elif m9 >= 20:
                m9 = 3
            elif m9 >= 10:
                m9 = 2
            elif m9 > 0:
                m9 = 1
            n1: float = ((c1 * m1) + (c2 * m2) + (c3 * m3) + (c4 * m4) + (c5 * m5) + (c6 * m6) + (c7 * m7) + (c8 * m8) +
                         (c9 * m9))
            d: float = (c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9)
            r4 = n1 / d
            print("")
            print("CGPA for Fourth Semester=", r4)
        if n == 5:
            c1 = 3
            c2 = 4
            c3 = 4
            c4 = 3
            c5 = 3
            c6 = 3
            c7 = 2
            c8 = 2
            c9 = 1
            m1 = float(input("Enter the marks of 18ES51="))
            m2 = float(input("Enter the marks of 18EC52="))
            m3 = float(input("Enter the marks of 18EC53="))
            m4 = float(input("Enter the marks of 18EC54="))
            m5 = float(input("Enter the marks of 18EC55="))
            m6 = float(input("Enter the marks of 18EC56="))
            m7 = float(input("Enter the marks of 18ECL57="))
            m8 = float(input("Enter the marks of 18ECL58="))
            m9 = float(input("Enter the marks of 18CIV59="))
            if m1 >= 90:
                m1 = 10
            elif m1 >= 80:
                m1 = 9
            elif m1 >= 70:
                m1 = 8
            elif m1 >= 60:
                m1 = 7
            elif m1 >= 50:
                m1 = 6
            elif m1 >= 40:
                m1 = 5
            elif m1 >= 30:
                m1 = 4
            elif m1 >= 20:
                m1 = 3
            elif m1 >= 10:
                m1 = 2
            elif m1 > 0:
                m1 = 1
            if m2 >= 90:
                m2 = 10
            elif m2 >= 80:
                m2 = 9
            elif m2 >= 70:
                m2 = 8
            elif m2 >= 60:
                m2 = 7
            elif m2 >= 50:
                m2 = 6
            elif m2 >= 40:
                m2 = 5
            elif m2 >= 30:
                m2 = 4
            elif m2 >= 20:
                m2 = 3
            elif m2 >= 10:
                m2 = 2
            elif m2 > 0:
                m2 = 1
            if m3 >= 90:
                m3 = 10
            elif m3 >= 80:
                m3 = 9
            elif m3 >= 70:
                m3 = 8
            elif m3 >= 60:
                m3 = 7
            elif m3 >= 50:
                m3 = 6
            elif m3 >= 40:
                m3 = 5
            elif m3 >= 30:
                m3 = 4
            elif m3 >= 20:
                m3 = 3
            elif m3 >= 10:
                m3 = 2
            elif m3 > 0:
                m3 = 1
            if m4 >= 90:
                m4 = 10
            elif m4 >= 80:
                m4 = 9
            elif m4 >= 70:
                m4 = 8
            elif m4 >= 60:
                m4 = 7
            elif m4 >= 50:
                m4 = 6
            elif m4 >= 40:
                m4 = 5
            elif m4 >= 30:
                m4 = 4
            elif m4 >= 20:
                m4 = 3
            elif m4 >= 10:
                m4 = 2
            elif m4 > 0:
                m4 = 1
            if m5 >= 90:
                m5 = 10
            elif m5 >= 80:
                m5 = 9
            elif m5 >= 70:
                m5 = 8
            elif m5 >= 60:
                m5 = 7
            elif m5 >= 50:
                m5 = 6
            elif m5 >= 40:
                m5 = 5
            elif m5 >= 30:
                m5 = 4
            elif m5 >= 20:
                m5 = 3
            elif m5 >= 10:
                m5 = 2
            elif m5 > 0:
                m5 = 1
            if m6 >= 90:
                m6 = 10
            elif m6 >= 80:
                m6 = 9
            elif m6 >= 70:
                m6 = 8
            elif m6 >= 60:
                m6 = 7
            elif m6 >= 50:
                m6 = 6
            elif m6 >= 40:
                m6 = 5
            elif m6 >= 30:
                m6 = 4
            elif m6 >= 20:
                m6 = 3
            elif m6 >= 10:
                m6 = 2
            elif m6 > 0:
                m6 = 1
            if m7 >= 90:
                m7 = 10
            elif m7 >= 80:
                m7 = 9
            elif m7 >= 70:
                m7 = 8
            elif m7 >= 60:
                m7 = 7
            elif m7 >= 50:
                m7 = 6
            elif m7 >= 40:
                m7 = 5
            elif m7 >= 30:
                m7 = 4
            elif m7 >= 20:
                m7 = 3
            elif m7 >= 10:
                m7 = 2
            elif m7 > 0:
                m7 = 1
            if m8 >= 90:
                m8 = 10
            elif m8 >= 80:
                m8 = 9
            elif m8 >= 70:
                m8 = 8
            elif m8 >= 60:
                m8 = 7
            elif m8 >= 50:
                m8 = 6
            elif m8 >= 40:
                m8 = 5
            elif m8 >= 30:
                m8 = 4
            elif m8 >= 20:
                m8 = 3
            elif m8 >= 10:
                m8 = 2
            elif m8 > 0:
                m8 = 1
            if m9 >= 90:
                m9 = 10
            elif m9 >= 80:
                m9 = 9
            elif m9 >= 70:
                m9 = 8
            elif m9 >= 60:
                m9 = 7
            elif m9 >= 50:
                m9 = 6
            elif m9 >= 40:
                m9 = 5
            elif m9 >= 30:
                m9 = 4
            elif m9 >= 20:
                m9 = 3
            elif m9 >= 10:
                m9 = 2
            elif m9 > 0:
                m9 = 1
            n1: float = ((c1 * m1) + (c2 * m2) + (c3 * m3) + (c4 * m4) + (c5 * m5) + (c6 * m6) + (c7 * m7) + (c8 * m8) +
                         (c9 * m9))
            d: float = (c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9)
            r5 = n1 / d
            print("")
            print("SGPA for Fifth Semester=", r5)
        if n == 6:
            c1 = 4
            c2 = 4
            c3 = 4
            c4 = 3
            c5 = 3
            c6 = 2
            c7 = 2
            c8 = 2
            m1 = float(input("Enter the marks of 18EC61="))
            m2 = float(input("Enter the marks of 18EC62="))
            m3 = float(input("Enter the marks of 18EC63="))
            m4 = float(input("Enter the marks of 18EC646="))
            m5 = float(input("Enter the marks of 18XX65X="))
            m6 = float(input("Enter the marks of 18ECL66="))
            m7 = float(input("Enter the marks of 18ECL67="))
            m8 = float(input("Enter the marks of 18ECMP68="))
            if m1 >= 90:
                m1 = 10
            elif m1 >= 80:
                m1 = 9
            elif m1 >= 70:
                m1 = 8
            elif m1 >= 60:
                m1 = 7
            elif m1 >= 50:
                m1 = 6
            elif m1 >= 40:
                m1 = 5
            elif m1 >= 30:
                m1 = 4
            elif m1 >= 20:
                m1 = 3
            elif m1 >= 10:
                m1 = 2
            elif m1 > 0:
                m1 = 1
            if m2 >= 90:
                m2 = 10
            elif m2 >= 80:
                m2 = 9
            elif m2 >= 70:
                m2 = 8
            elif m2 >= 60:
                m2 = 7
            elif m2 >= 50:
                m2 = 6
            elif m2 >= 40:
                m2 = 5
            elif m2 >= 30:
                m2 = 4
            elif m2 >= 20:
                m2 = 3
            elif m2 >= 10:
                m2 = 2
            elif m2 > 0:
                m2 = 1
            if m3 >= 90:
                m3 = 10
            elif m3 >= 80:
                m3 = 9
            elif m3 >= 70:
                m3 = 8
            elif m3 >= 60:
                m3 = 7
            elif m3 >= 50:
                m3 = 6
            elif m3 >= 40:
                m3 = 5
            elif m3 >= 30:
                m3 = 4
            elif m3 >= 20:
                m3 = 3
            elif m3 >= 10:
                m3 = 2
            elif m3 > 0:
                m3 = 1
            if m4 >= 90:
                m4 = 10
            elif m4 >= 80:
                m4 = 9
            elif m4 >= 70:
                m4 = 8
            elif m4 >= 60:
                m4 = 7
            elif m4 >= 50:
                m4 = 6
            elif m4 >= 40:
                m4 = 5
            elif m4 >= 30:
                m4 = 4
            elif m4 >= 20:
                m4 = 3
            elif m4 >= 10:
                m4 = 2
            elif m4 > 0:
                m4 = 1
            if m5 >= 90:
                m5 = 10
            elif m5 >= 80:
                m5 = 9
            elif m5 >= 70:
                m5 = 8
            elif m5 >= 60:
                m5 = 7
            elif m5 >= 50:
                m5 = 6
            elif m5 >= 40:
                m5 = 5
            elif m5 >= 30:
                m5 = 4
            elif m5 >= 20:
                m5 = 3
            elif m5 >= 10:
                m5 = 2
            elif m5 > 0:
                m5 = 1
            if m6 >= 90:
                m6 = 10
            elif m6 >= 80:
                m6 = 9
            elif m6 >= 70:
                m6 = 8
            elif m6 >= 60:
                m6 = 7
            elif m6 >= 50:
                m6 = 6
            elif m6 >= 40:
                m6 = 5
            elif m6 >= 30:
                m6 = 4
            elif m6 >= 20:
                m6 = 3
            elif m6 >= 10:
                m6 = 2
            elif m6 > 0:
                m6 = 1
            if m7 >= 90:
                m7 = 10
            elif m7 >= 80:
                m7 = 9
            elif m7 >= 70:
                m7 = 8
            elif m7 >= 60:
                m7 = 7
            elif m7 >= 50:
                m7 = 6
            elif m7 >= 40:
                m7 = 5
            elif m7 >= 30:
                m7 = 4
            elif m7 >= 20:
                m7 = 3
            elif m7 >= 10:
                m7 = 2
            elif m7 > 0:
                m7 = 1
            if m8 >= 90:
                m8 = 10
            elif m8 >= 80:
                m8 = 9
            elif m8 >= 70:
                m8 = 8
            elif m8 >= 60:
                m8 = 7
            elif m8 >= 50:
                m8 = 6
            elif m8 >= 40:
                m8 = 5
            elif m8 >= 30:
                m8 = 4
            elif m8 >= 20:
                m8 = 3
            elif m8 >= 10:
                m8 = 2
            elif m8 > 0:
                m8 = 1
            n1: float = ((c1 * m1) + (c2 * m2) + (c3 * m3) + (c4 * m4) + (c5 * m5) + (c6 * m6) + (c7 * m7) + (c8 * m8))
            d: float = (c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8)
            r6 = n1 / d
            print("")
            print("SGPA for Sixth Semester=", r6)
        if n == 7:
            c1 = 3
            c2 = 3
            c3 = 3
            c4 = 3
            c5 = 3
            c6 = 2
            c7 = 2
            c8 = 1
            m1 = float(input("Enter the marks of 18EC71="))
            m2 = float(input("Enter the marks of 18EC72="))
            m3 = float(input("Enter the marks of 18XX73X="))
            m4 = float(input("Enter the marks of 18XX74X="))
            m5 = float(input("Enter the marks of 18XX75X="))
            m6 = float(input("Enter the marks of 18ECL76="))
            m7 = float(input("Enter the marks of 18ECL77="))
            m8 = float(input("Enter the marks of 18ECP78="))
            if m1 >= 90:
                m1 = 10
            elif m1 >= 80:
                m1 = 9
            elif m1 >= 70:
                m1 = 8
            elif m1 >= 60:
                m1 = 7
            elif m1 >= 50:
                m1 = 6
            elif m1 >= 40:
                m1 = 5
            elif m1 >= 30:
                m1 = 4
            elif m1 >= 20:
                m1 = 3
            elif m1 >= 10:
                m1 = 2
            elif m1 > 0:
                m1 = 1
            if m2 >= 90:
                m2 = 10
            elif m2 >= 80:
                m2 = 9
            elif m2 >= 70:
                m2 = 8
            elif m2 >= 60:
                m2 = 7
            elif m2 >= 50:
                m2 = 6
            elif m2 >= 40:
                m2 = 5
            elif m2 >= 30:
                m2 = 4
            elif m2 >= 20:
                m2 = 3
            elif m2 >= 10:
                m2 = 2
            elif m2 > 0:
                m2 = 1
            if m3 >= 90:
                m3 = 10
            elif m3 >= 80:
                m3 = 9
            elif m3 >= 70:
                m3 = 8
            elif m3 >= 60:
                m3 = 7
            elif m3 >= 50:
                m3 = 6
            elif m3 >= 40:
                m3 = 5
            elif m3 >= 30:
                m3 = 4
            elif m3 >= 20:
                m3 = 3
            elif m3 >= 10:
                m3 = 2
            elif m3 > 0:
                m3 = 1
            if m4 >= 90:
                m4 = 10
            elif m4 >= 80:
                m4 = 9
            elif m4 >= 70:
                m4 = 8
            elif m4 >= 60:
                m4 = 7
            elif m4 >= 50:
                m4 = 6
            elif m4 >= 40:
                m4 = 5
            elif m4 >= 30:
                m4 = 4
            elif m4 >= 20:
                m4 = 3
            elif m4 >= 10:
                m4 = 2
            elif m4 > 0:
                m4 = 1
            if m5 >= 90:
                m5 = 10
            elif m5 >= 80:
                m5 = 9
            elif m5 >= 70:
                m5 = 8
            elif m5 >= 60:
                m5 = 7
            elif m5 >= 50:
                m5 = 6
            elif m5 >= 40:
                m5 = 5
            elif m5 >= 30:
                m5 = 4
            elif m5 >= 20:
                m5 = 3
            elif m5 >= 10:
                m5 = 2
            elif m5 > 0:
                m5 = 1
            if m6 >= 90:
                m6 = 10
            elif m6 >= 80:
                m6 = 9
            elif m6 >= 70:
                m6 = 8
            elif m6 >= 60:
                m6 = 7
            elif m6 >= 50:
                m6 = 6
            elif m6 >= 40:
                m6 = 5
            elif m6 >= 30:
                m6 = 4
            elif m6 >= 20:
                m6 = 3
            elif m6 >= 10:
                m6 = 2
            elif m6 > 0:
                m6 = 1
            if m7 >= 90:
                m7 = 10
            elif m7 >= 80:
                m7 = 9
            elif m7 >= 70:
                m7 = 8
            elif m7 >= 60:
                m7 = 7
            elif m7 >= 50:
                m7 = 6
            elif m7 >= 40:
                m7 = 5
            elif m7 >= 30:
                m7 = 4
            elif m7 >= 20:
                m7 = 3
            elif m7 >= 10:
                m7 = 2
            elif m7 > 0:
                m7 = 1
            if m8 >= 90:
                m8 = 10
            elif m8 >= 80:
                m8 = 9
            elif m8 >= 70:
                m8 = 8
            elif m8 >= 60:
                m8 = 7
            elif m8 >= 50:
                m8 = 6
            elif m8 >= 40:
                m8 = 5
            elif m8 >= 30:
                m8 = 4
            elif m8 >= 20:
                m8 = 3
            elif m8 >= 10:
                m8 = 2
            elif m8 > 0:
                m8 = 1
            n1: float = ((c1 * m1) + (c2 * m2) + (c3 * m3) + (c4 * m4) + (c5 * m5) + (c6 * m6) + (c7 * m7) + (c8 * m8))
            d: float = (c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8)
            r7 = n1 / d
            print("")
            print("SGPA for Seventh Semester=", r7)
        if n == 8:
            c1 = 3
            c2 = 3
            c3 = 8
            c4 = 1
            c5 = 3
            m1 = float(input("Enter the marks of 18EC81="))
            m2 = float(input("Enter the marks of 18XX82X="))
            m3 = float(input("Enter the marks of 18ECP83="))
            m4 = float(input("Enter the marks of 18ECS84="))
            m5 = float(input("Enter the marks of 18ECI85="))
            if m1 >= 90:
                m1 = 10
            elif m1 >= 80:
                m1 = 9
            elif m1 >= 70:
                m1 = 8
            elif m1 >= 60:
                m1 = 7
            elif m1 >= 50:
                m1 = 6
            elif m1 >= 40:
                m1 = 5
            elif m1 >= 30:
                m1 = 4
            elif m1 >= 20:
                m1 = 3
            elif m1 >= 10:
                m1 = 2
            elif m1 > 0:
                m1 = 1
            if m2 >= 90:
                m2 = 10
            elif m2 >= 80:
                m2 = 9
            elif m2 >= 70:
                m2 = 8
            elif m2 >= 60:
                m2 = 7
            elif m2 >= 50:
                m2 = 6
            elif m2 >= 40:
                m2 = 5
            elif m2 >= 30:
                m2 = 4
            elif m2 >= 20:
                m2 = 3
            elif m2 >= 10:
                m2 = 2
            elif m2 > 0:
                m2 = 1
            if m3 >= 90:
                m3 = 10
            elif m3 >= 80:
                m3 = 9
            elif m3 >= 70:
                m3 = 8
            elif m3 >= 60:
                m3 = 7
            elif m3 >= 50:
                m3 = 6
            elif m3 >= 40:
                m3 = 5
            elif m3 >= 30:
                m3 = 4
            elif m3 >= 20:
                m3 = 3
            elif m3 >= 10:
                m3 = 2
            elif m3 > 0:
                m3 = 1
            if m4 >= 90:
                m4 = 10
            elif m4 >= 80:
                m4 = 9
            elif m4 >= 70:
                m4 = 8
            elif m4 >= 60:
                m4 = 7
            elif m4 >= 50:
                m4 = 6
            elif m4 >= 40:
                m4 = 5
            elif m4 >= 30:
                m4 = 4
            elif m4 >= 20:
                m4 = 3
            elif m4 >= 10:
                m4 = 2
            elif m4 > 0:
                m4 = 1
            if m5 >= 90:
                m5 = 10
            elif m5 >= 80:
                m5 = 9
            elif m5 >= 70:
                m5 = 8
            elif m5 >= 60:
                m5 = 7
            elif m5 >= 50:
                m5 = 6
            elif m5 >= 40:
                m5 = 5
            elif m5 >= 30:
                m5 = 4
            elif m5 >= 20:
                m5 = 3
            elif m5 >= 10:
                m5 = 2
            elif m5 > 0:
                m5 = 1
            n1: float = ((c1 * m1) + (c2 * m2) + (c3 * m3) + (c4 * m4) + (c5 * m5))
            d: float = (c1 + c2 + c3 + c4 + c5)
            r8 = n1 / d
            print("")
            print("SGPA for Eighth Semester=", r8)
        print("")
        time.sleep(1)
    r: float = (r1+r2+r3+r4+r5+r6+r7+r8)/a
    print("CGPA = ", r)
    print("")
    time.sleep(1)
