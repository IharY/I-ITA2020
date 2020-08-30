package by.ita.yanush.les07;

/*
Составте описание класса для представления времени. Предусмотрите возможности установки времени и изменения его
отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений
полей поле устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут и секунд.
 */
public class Test04 {
    private int hours;
    private int minutes;
    private int seconds;

    Test04() {
        hours = 10;
        minutes = 0;
        seconds = 0;
    }

    Test04(int hours, int minutes, int seconds) {
        if (hours < 24 && hours >= 0) {
            this.hours = hours;
        } else {
            hours = 0;
        }

        if (minutes < 60 && minutes >= 0) {
            this.minutes = minutes;
        } else {
            minutes = 0;
        }

        if (seconds < 60 && seconds >= 0) {
            this.seconds = seconds;
        } else {
            seconds = 0;
        }
    }

    public void setHours(int hours) {
        if (hours < 24 && hours >= 0) {
            this.hours = hours;
        } else {
            hours = 0;
        }
    }

    public int getHours() {
        return hours;
    }

    public void setMinutes(int minutes) {
        if (minutes < 60 && minutes >= 0) {
            this.minutes = minutes;
        } else {
            minutes = 0;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds < 60 && seconds >= 0) {
            this.seconds = seconds;
        } else {
            seconds = 0;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean increase(int extraHours, int extraMinutes, int extraSeconds) {
        if (extraHours >= 0 && extraMinutes >= 0 && extraSeconds >= 0) {
            int carries = 0;

            seconds = seconds + extraSeconds;
            while (seconds > 59) {
                seconds -= 60;
                carries++;
            }

            minutes = minutes + extraMinutes + carries;
            carries = 0;
            while (minutes > 59) {
                minutes -= 60;
                carries++;
            }

            hours = hours + extraHours + carries;
            while (hours > 23) {
                hours -= 24;
            }

            return true;
        }
        return false;
    }

    public boolean decrease(int exHours, int exMinutes, int exSeconds) {
        if (exHours >= 0 && exMinutes >= 0 && exSeconds >= 0) {
            int carries = 0;

            seconds = seconds - exSeconds;
            while (seconds < 0) {
                seconds += 60;
                carries++;
            }

            minutes = minutes - exMinutes - carries;
            carries = 0;
            while (minutes < 0) {
                minutes += 60;
                carries++;
            }

            hours = hours - exHours - carries;
            while (hours < 0) {
                hours += 24;
            }

            return true;
        }
        return false;
    }
}
