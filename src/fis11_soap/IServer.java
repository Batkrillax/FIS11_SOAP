/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fis11_soap;

/**
 *
 * @author squoz
 */
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IServer {

    @WebMethod
    public Result solve(double x, double a, double b);
}
