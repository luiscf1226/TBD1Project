/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectotbd1;

/**
 *
 * @author Luis Carlos Flores
 */
public class Products {
    public int ProductID;
    public String ProductName;
    public int SupplierID;
    public int CategoryID;
    public String QuantityUnit;
    public double UnitPrice;
    public int UnitsinStock;
    public int UnitsonOrder;
    public int Reorder;
    public int Discontinued;
    public int cantidad;
    

    public Products() {
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public int getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(int SupplierID) {
        this.SupplierID = SupplierID;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int CategoryID) {
        this.CategoryID = CategoryID;
    }

    public String getQuantityUnit() {
        return QuantityUnit;
    }

    public void setQuantityUnit(String QuantityUnit) {
        this.QuantityUnit = QuantityUnit;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    public int getUnitsinStock() {
        return UnitsinStock;
    }

    public void setUnitsinStock(int UnitsinStock) {
        this.UnitsinStock = UnitsinStock;
    }

    public int getUnitsonOrder() {
        return UnitsonOrder;
    }

    public void setUnitsonOrder(int UnitsonOrder) {
        this.UnitsonOrder = UnitsonOrder;
    }

    public int getReorder() {
        return Reorder;
    }

    public void setReorder(int Reorder) {
        this.Reorder = Reorder;
    }

    public int getDiscontinued() {
        return Discontinued;
    }

    public void setDiscontinued(int Discontinued) {
        this.Discontinued = Discontinued;
    }
    
    
}
