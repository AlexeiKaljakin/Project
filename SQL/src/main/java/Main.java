package main.java;

import db.MySQLConnector;
import objects.Curator;
import objects.Group;
import objects.Student;
import tables.CuratorTable;
import tables.GroupTable;
import tables.StudentTable;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try {

            StudentTable studentTable = new StudentTable();
            ArrayList<Student> students = studentTable.selectAll();
            if (students.size() < 15) {
                studentTable.insert(new Student(1, "Григорьев Иван Петрович", "М", 1));
                studentTable.insert(new Student(2, "Иванов Иван Иванович", "М", 2));
                studentTable.insert(new Student(3, "Сидорова Екатерина Петровна", "Ж", 3));
                studentTable.insert(new Student(4, "Горький Максим Михайлович", "М", 1));
                studentTable.insert(new Student(5, "Пушкин Александр Сергеевич", "М", 2));
                studentTable.insert(new Student(6, "Лермонтов Антон Иванович", "М", 3));
                studentTable.insert(new Student(7, "Красильникова Екатерина Ивановна", "Ж", 1));
                studentTable.insert(new Student(8, "Мышкина Марина Алексеевна", "Ж", 1));
                studentTable.insert(new Student(9, "Иванова Александра Александровна", "Ж", 1));
                studentTable.insert(new Student(10, "Садко Анфиноген Никифорович", "М", 3));
                studentTable.insert(new Student(11, "Шматко Петр Петрович", "М", 3));
                studentTable.insert(new Student(12, "Афонин Жбан Иванович", "М", 2));
                studentTable.insert(new Student(13, "Сясин Дмитрий Петрович", "М", 1));
                studentTable.insert(new Student(14, "Сергеев Сергей Сергеевич", "М", 3));
                studentTable.insert(new Student(15, "Михалков Петр Сергеевич", "М", 1));
                students = studentTable.selectAll();
            }

            GroupTable groupTable = new GroupTable();
            ArrayList<Group> groups = groupTable.selectAll();
            if (groups.size() < 3) {
                groupTable.insert(new Group(1, "Сопромат", 1));
                groupTable.insert(new Group(2, "ФизМат", 2));
                groupTable.insert(new Group(3, "ФизМат", 4));
                groupTable.insert(new Group(4, "Спорт", 3));
                groups = groupTable.selectAll();
            }


            CuratorTable curatorTable = new CuratorTable();
            ArrayList<Curator> curators = curatorTable.selectAll();
            if (curators.size() < 4) {
                curatorTable.insert(new Curator(1, "Петренко Михаил Денисович"));
                curatorTable.insert(new Curator(2, "Штименко Иван Тамерланович"));
                curatorTable.insert(new Curator(3, "Игнатов Денис Викторович"));
                curatorTable.insert(new Curator(4, "Иваницкая Мария Петровна"));
            }

            studentTable.selectAllStudent();

            studentTable.selectSumm();

            studentTable.selectWomen();

            groupTable.selectCurator();

            groups.get(2).setId_curator(3);
            groupTable.updateCurator(groups.get(2));

            studentTable.selectStudentGroup();




        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MySQLConnector.close();
        }
    }
}
