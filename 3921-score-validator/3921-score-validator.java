class Solution {
    public int[] scoreValidator(String[] events) {
        int score = 0, c = 0;

        for (String s : events) {

            if (s.equals("W")) {
                c++;
                if (c >= 10) {
                    break;
                }
                continue;
            }

            if (s.equals("WD") || s.equals("NB")) {
                score++;
            } else {
                score += Integer.parseInt(s);
            }
        }

        return new int[]{score, c};
    }
}