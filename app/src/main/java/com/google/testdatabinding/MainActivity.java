package com.google.testdatabinding;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.testdatabinding.databinding.ActivityMainBinding;
import com.google.testdatabinding.models.Product;
import com.google.testdatabinding.util.Products;

public class MainActivity extends AppCompatActivity implements MainActivityImp{

    private Product mProduct;

    ActivityMainBinding mBinding ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding=DataBindingUtil.setContentView(this ,R.layout.activity_main);
        Products product=new Products();

         mProduct = product.PRODUCTS[0];

        mBinding.setProduct(mProduct);
        mBinding.setQuantity(1);
        mBinding.setIMainActivity(this);
/*
mBinding.setTestUrl("");

 */


    }

    @Override
    public void inflateQuantityDialoge() {
        ChooseQuantityDialog chooseQuantityDialog=new ChooseQuantityDialog();
        chooseQuantityDialog.show(getSupportFragmentManager() ,getString(R.string.dialog_choose_quantity));
    }

    @Override
    public void setQuantity(int quantity) {
        mBinding.setQuantity(quantity);
    }
}
