package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
		int i = 0;
        StringBuilder str = new StringBuilder();
        while (i < chars.length)
		{
            str.append(chars[i]);
            i++;
        }
        System.out.print(str);
    }
}
