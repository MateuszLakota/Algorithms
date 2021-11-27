package ProjectEuler;

/*
 * The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
 * 731671765313306249192251196744265747423553491949349698352031277450632623957831801698480186947885184385861560789112949
 * 495459501737958331952853208805511125406987471585238630507156932909632952274430435576689664895044524452316173185640309
 * 871112172238311362229893423380308135336276614282806444486645238749303589072962904915604407723907138105158593079608667
 * 017242712188399879790879227492190169972088809377665727333001053367881220235421809751254540594752243525849077116705560
 * 136048395864467063244157221553975369781797784617406495514929086256932197846862248283972241375657056057490261407972968
 * 652414535100474821663704844031998900088952434506585412275886668811642717147992444292823086346567481391912316282458617
 * 866458359124566529476545682848912883142607690042242190226710556263211111093705442175069416589604080719840385096245544
 * 436298123098787992724428490918884580156166097919133875499200524063689912560717606058861164671094050775410022569831552
 * 0005593572972571636269561882670428252483600823257530420752963450
 * Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this
 * product?
 *
 * Copyright © 2021 ProjectEuler.net
 * Source: https://projecteuler.net/problem=8
 */

class Problem8 {
    static long solveProblem() {
        String digit0 = "0";
        long greatestProductOf13AdjacentDigits = 0L;
        String numberAsAString = "73167176531330624919225119674426574742355349194934969835203127745063262395783180169" +
                "8480186947885184385861560789112949495459501737958331952853208805511125406987471585238630507156932909" +
                "6329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828" +
                "0644448664523874930358907296290491560440772390713810515859307960866701724271218839987979087922749219" +
                "0169972088809377665727333001053367881220235421809751254540594752243525849077116705560136048395864467" +
                "0632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729" +
                "6865241453510047482166370484403199890008895243450658541227588666881164271714799244429282308634656748" +
                "1391912316282458617866458359124566529476545682848912883142607690042242190226710556263211111093705442" +
                "1750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240" +
                "6368991256071760605886116467109405077541002256983155200055935729725716362695618826704282524836008232" +
                "57530420752963450";
        short numberAsAStringLength = (short) numberAsAString.length();
        short numberOfAdjacentNot0Digits = 0;
        String[] digitsAsStrings = numberAsAString.split("");
        byte[] digits = new byte[numberAsAStringLength];
        for (short i = 0; i < numberAsAStringLength; i++) {
            if (digitsAsStrings[i].equals(digit0)) {
                numberOfAdjacentNot0Digits = 0;
            } else {
                digits[i] = Byte.parseByte(digitsAsStrings[i]);
                numberOfAdjacentNot0Digits++;
                if (numberOfAdjacentNot0Digits >= 13 && i >= 12) {
                    long productOf13AdjacentDigits = 1L;
                    for (short j = (short) (i - 12); j <= i; j++) {
                        productOf13AdjacentDigits *= digits[j];
                    }
                    if (productOf13AdjacentDigits > greatestProductOf13AdjacentDigits) {
                        greatestProductOf13AdjacentDigits = productOf13AdjacentDigits;
                    }
                }
            }
        }
        return greatestProductOf13AdjacentDigits;
    }
}
