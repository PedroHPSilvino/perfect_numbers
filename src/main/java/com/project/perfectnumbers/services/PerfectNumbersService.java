package com.project.perfectnumbers.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PerfectNumbersService {

    public List<Integer> findPerfectNumbersBetween(int start, int end) {
        List<Integer> perfectNumbers = new ArrayList<>();
        for (int num = start; num <= end; num++) {
            if (isPerfectNumber(num)) {
                perfectNumbers.add(num);
            }
        }
        return perfectNumbers;
    }

    private boolean isPerfectNumber(int number) {
        int sum = 1; // Start with 1 because it's a divisor of every number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }
        return sum == number && number != 1;
    }
}
