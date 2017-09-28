/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author L115student
 */
public class TipService {

    private TipCalculator tipCalc;

    public TipService(TipCalculator tipCalc) {
        this.setTipCalc(tipCalc);
    }

    public final TipCalculator getTipCalc() {
        return tipCalc;
    }

    public final void setTipCalc(TipCalculator tipCalc) {
        if (tipCalc == null) {

            throw new IllegalArgumentException("Error: Tip Calc cannot be null.");

        }
        this.tipCalc = tipCalc;
    }

    public final double getTipAmount() {
        return tipCalc.getTip();
    }

}
