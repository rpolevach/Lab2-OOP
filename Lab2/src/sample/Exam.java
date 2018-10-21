package sample;
import sample.*;
import java.time.LocalDate;

public class Exam extends Challenge
{
    private String examiner;          //Кто принимает экзамен
    private String auditory;          //Номер аудитории
    private int examTicket;           //Кол-во экзаменационных билетов

    public Exam(LocalDate date, String level, String name, String examiner, String auditory, int examTicket)
    {
        super(date, level, name);
        this.examiner = examiner;
        this.auditory = auditory;
        this.examTicket = examTicket;
    }
}
