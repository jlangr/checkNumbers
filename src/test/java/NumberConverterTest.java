import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NumberConverterTest {
    @Test
    public void zero() {
        assertThat(NumberConverter.toWords(0), is(equalTo("zero")));
    }

    @Ignore
    @Test
    public void single_digit() {
        assertThat(NumberConverter.toWords(1), is(equalTo("one")));
        assertThat(NumberConverter.toWords(9), is(equalTo("nine")));
    }

    @Ignore
    @Test
    public void special_case_two_digit() {
        assertThat(NumberConverter.toWords(10), is(equalTo("ten")));
        assertThat(NumberConverter.toWords(19), is(equalTo("nineteen")));
    }

    @Ignore
    @Test
    public void multiples_of_ten() {
        assertThat(NumberConverter.toWords(20), is(equalTo("twenty")));
        assertThat(NumberConverter.toWords(90), is(equalTo("ninety")));
    }

    @Ignore
    @Test
    public void not_multiples_of_ten_21_to_99() {
        assertThat(NumberConverter.toWords(21), is(equalTo("twenty-one")));
        assertThat(NumberConverter.toWords(55), is(equalTo("fifty-five")));
        assertThat(NumberConverter.toWords(99), is(equalTo("ninety-nine")));
    }

    @Ignore
    @Test
    public void hundreds() {
        assertThat(NumberConverter.toWords(100), is(equalTo("one hundred")));
        assertThat(NumberConverter.toWords(900), is(equalTo("nine hundred")));
    }

    @Ignore
    @Test
    public void not_multiples_of_one_hundred_LT_1000() {
        assertThat(NumberConverter.toWords(101), is(equalTo("one hundred one")));
        assertThat(NumberConverter.toWords(999), is(equalTo("nine hundred ninety-nine")));
    }

    @Ignore
    @Test
    public void thousands() {
        assertThat(NumberConverter.toWords(1000), is(equalTo("one thousand")));
        assertThat(NumberConverter.toWords(9000), is(equalTo("nine thousand")));
    }

    @Ignore
    @Test
    public void not_even_thousands() {
        assertThat(NumberConverter.toWords(9999), is(equalTo("nine thousand nine hundred ninety-nine")));
        assertThat(NumberConverter.toWords(9911), is(equalTo("nine thousand nine hundred eleven")));
    }

    @Ignore
    @Test
    public void tens_of_thousands() {
        assertThat(NumberConverter.toWords(10000), is(equalTo("ten thousand")));
        assertThat(NumberConverter.toWords(19000), is(equalTo("nineteen thousand")));
    }

    @Ignore
    @Test
    public void tens_of_thousands_and_some() {
        assertThat(NumberConverter.toWords(19999), is(equalTo("nineteen thousand nine hundred ninety-nine")));
    }

    @Ignore
    @Test
    public void hundred_thousand() {
        assertThat(NumberConverter.toWords(100000), is(equalTo("one hundred thousand")));
        assertThat(NumberConverter.toWords(700000), is(equalTo("seven hundred thousand")));
    }

    @Ignore
    @Test
    public void not_exactly_hundred_thousand() {
        assertThat(NumberConverter.toWords(198000), is(equalTo("one hundred ninety-eight thousand")));
        assertThat(NumberConverter.toWords(701020), is(equalTo("seven hundred one thousand twenty")));
    }

    @Ignore
    @Test
    public void millions() {
        assertThat(NumberConverter.toWords(1000000), is(equalTo("one million")));
    }
}
