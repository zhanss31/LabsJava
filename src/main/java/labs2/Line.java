package labs2;

public class Line {
    private String str;

    public Line() {
        this.str = null;
    }

    public Line(String str) {
        this.str = str;
    }

    private String[] createMatrix(String str) {
        String tmp = str;
        tmp = tmp.trim();
        int length = 1;
        while (tmp.indexOf(' ') >= 0) {
            if (tmp.indexOf(' ') != tmp.length()) {
                tmp = tmp.substring(tmp.indexOf(' ') + 1);
                length++;
            }
            tmp = tmp.trim();
        }
        String[] words = new String[length];
        String tmp1 = str;
        tmp1 = tmp1.trim();
        for (int i = 0; i < words.length; i++) {
            if (tmp1.indexOf(' ') != tmp1.length() && tmp1.indexOf(' ') > 0) {
                words[i] = tmp1.substring(0, tmp1.indexOf(' '));
                tmp1 = tmp1.substring(tmp1.indexOf(' ') + 1);
            }
            tmp1 = tmp1.trim();

        }
        words[words.length - 1] = tmp1.substring(0, tmp1.length());
        return words;

    }

    private String[] matrixWithoutRepetition(String[] arr) {
        int length = arr.length;
        String[] tmp = new String[arr.length];
        System.arraycopy(arr, 0, tmp, 0, arr.length);
        for (int i = 0; i < tmp.length; i++) {
            for (int j = i + 1; j < tmp.length; j++) {
                if (arr[i].equals(arr[j])) {
                    tmp[j] = " ";
                }

            }
        }
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i].equals(" ")) {
                length--;
            }
        }
        String[] tmp_arr = new String[length];
        int k = 0;
        for (int i = 0; i < tmp.length; i++) {
            if (!tmp[i].equals(" ")) {
                tmp_arr[k] = tmp[i];
                k++;
            }
        }

        return tmp_arr;

    }

    public String lineWithAmount() {
        String[] tmp = createMatrix(this.str);
        String[] arr = matrixWithoutRepetition(tmp);
        int[] amount = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            amount[i] = 0;
            for (int j = 0; j < tmp.length; j++) {
                if (arr[i].equals(tmp[j]))
                    amount[i]++;
            }
        }

        String str2 = arr[0] + ':' + amount[0] + ' ';
        for (int i = 1; i < arr.length; i++) {
            str2 += arr[i] + ':' + amount[i] + ' ';
        }
        return str2;

    }

    public String lineWithoutRepetitions() {
        String[] tmp = createMatrix(this.str);
        String[] arr = matrixWithoutRepetition(tmp);
        String str2 = arr[0] + ' ';
        for (int i = 1; i < arr.length; i++) {
            str2 += arr[i] + ' ';
        }

        return str2;
    }

}
