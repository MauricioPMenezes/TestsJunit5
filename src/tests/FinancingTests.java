package tests;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {


        @Test
        public void ConstrutorShouldCreatedObjectWhenValidData(){
            //arrange
            double totalAmount =100000.0;
            double income = 2000.0;
            int months=80;
            //action
            Financing fi_teste = new Financing(totalAmount,income,months);
            //assert
            Assertions.assertEquals(totalAmount,fi_teste.getTotalAmount());
            Assertions.assertEquals(income,fi_teste.getIncome());
            Assertions.assertEquals(months,fi_teste.getMonths());

        }

        @Test
        public void ConstrutorShouldThrowIllegalArgumentExceptionWhenInvalideData(){

            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                double totalAmount =100000.0;
                double income = 2000.0;
                int months=20;
                Financing fi_teste = new Financing(totalAmount,income,months);
            });

        }


        @Test
        public void setTotalAmountShouldSetDataWhenValideDate(){
            //arrange
            double totalAmount =100000.0;
            double income = 2000.0;
            int months=80;
            Financing fi_teste = new Financing(totalAmount,income,months);
            //action
            fi_teste.setTotalAmount(80000.0);
            //assert
            Assertions.assertEquals(80000.0,fi_teste.getTotalAmount());
        }

        @Test
        public void setTotalAmountShouldIllegalArgumentExceptionWhenInvalideDate(){

            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                double totalAmount =100000.0;
                double income =2000.0;
                int months=80;
                Financing fi_teste = new Financing(totalAmount,income,months);
                fi_teste.setTotalAmount(110000.0);

            });
        }


        @Test
        public void setIncomeShouldIncreaseTotalAmountWhenValideDate(){

            double totalAmount =100000.0;
            double income = 2000.0;
            int months=80;
            Financing fi_teste = new Financing(totalAmount,income,months);
            fi_teste.setIncome(3000.0);
            Assertions.assertEquals(3000.0,fi_teste.getIncome());
        }

        @Test
        public void setIncomeShouldIllegalArgumentExceptionWhenInvalideDate(){

            Assertions.assertThrows(IllegalArgumentException.class, () -> {

                double totalAmount =100000.0;
                double income = 2000.0;
                int months=80;
                Financing fi_teste = new Financing(totalAmount,income,months);
                fi_teste.setIncome(1500.0);

            });
        }

        @Test
        public void setMonthsShouldIncreaseMonthsWhenValideDate(){

            double totalAmount =100000.0;
            double income = 2000.0;
            int months=80;
            Financing fi_teste = new Financing(totalAmount,income,months);
            fi_teste.setMonths(90);
            Assertions.assertEquals(90,fi_teste.getMonths());
        }

        @Test
        public void setMonthsShouldIllegalArgumentExceptionWhenInvalideDate(){

            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                double totalAmount =100000.0;
                double income = 2000.0;
                int months=80;
                Financing fi_teste = new Financing(totalAmount,income,months);
                fi_teste.setMonths(50);

            });
        }

    @Test
    public void entryShouldCalculateEntryCorrectly(){

        double totalAmount =100000.0;
        double income = 2000.0;
        int months=80;
        Financing fi_teste = new Financing(totalAmount,income,months);

        Assertions.assertEquals(20000.0,fi_teste.entry());
    }

    @Test
    public void quotaShouldCalculateQuotaCorrectly(){

        double totalAmount =100000.0;
        double income = 2000.0;
        int months=80;
        Financing fi_teste = new Financing(totalAmount,income,months);

        Assertions.assertEquals(1000.0,fi_teste.quota());
    }

}
