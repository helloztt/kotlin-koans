/*
 * Copyright (c) 2001-2018 GuaHao.com Corporation Limited. All rights reserved. 
 * This software is the confidential and proprietary information of GuaHao Company. 
 * ("Confidential Information"). 
 * You shall not disclose such Confidential Information and shall use it only 
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package i_introduction._10_Object_Expressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import util.JavaCode;

/**
 * TODO
 *
 * @author helloztt
 * @version V1.2.5
 * @since 2018-04-23 16:36
 */
public class JavaCode10 extends JavaCode {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1,5,2);
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
    }
}
