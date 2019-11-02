package cn.test.demo;

import java.math.BigDecimal;

/**
 *  浮点数计算工具类
 */
public class ArithUtil {

    /**
     * 浮点数加法
     *
     * @param num1
     * @param num2
     * @return
     */
    public static double add(double num1, double num2) {
        BigDecimal decimal = new BigDecimal(Double.toString(num1));
        BigDecimal decima2 = new BigDecimal(Double.toString(num2));
        return decimal.add(decima2).doubleValue();
    }

    /**
     * 浮点数减法
     *
     * @param num1
     * @param num2
     * @return
     */
    public static double sub(double num1, double num2) {
        BigDecimal decimal = new BigDecimal(Double.toString(num1));
        BigDecimal decima2 = new BigDecimal(Double.toString(num2));
        return decimal.subtract(decima2).doubleValue();
    }

    /**
     * 浮点数乘法
     *
     * @param num1
     * @param num2
     * @return
     */
    public static double mul(double num1, double num2) {
        BigDecimal decimal = new BigDecimal(Double.toString(num1));
        BigDecimal decima2 = new BigDecimal(Double.toString(num2));
        return decimal.multiply(decima2).doubleValue();
    }

    /**
     * 浮点数乘法
     *
     * @param num1
     * @param num2
     * @param scale 精确位数
     * @return
     */
    public static double mul(double num1, double num2, int scale) {
        BigDecimal decimal = new BigDecimal(Double.toString(num1));
        BigDecimal decima2 = new BigDecimal(Double.toString(num2));
        return decimal.multiply(decima2).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * 浮点数除法
     *
     * @param num1
     * @param num2
     * @param scale 精确位数
     * @return
     */
    public static double div(double num1, double num2, int scale) {
        BigDecimal decimal = new BigDecimal(Double.toString(num1));
        BigDecimal decima2 = new BigDecimal(Double.toString(num2));
        return decimal.divide(decima2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * 四舍五入
     *
     * @param value 浮点数
     * @param scale 精确位数
     * @return
     */
    public static double round(double value, int scale) {
        return new BigDecimal(Double.toString(value)).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * 直接删除多余的小数位
     *
     * @param value 浮点数
     * @param scale 精确位数
     * @return
     */
    public static double down(double value, int scale) {
        return new BigDecimal(Double.toString(value)).setScale(scale, BigDecimal.ROUND_DOWN).doubleValue();
    }

    /**
     * 进位处理
     *
     * @param value 浮点数
     * @param scale 精确位数
     * @return
     */
    public static double up(double value, int scale) {
        return new BigDecimal(Double.toString(value)).setScale(scale, BigDecimal.ROUND_UP).doubleValue();
    }
}
