/*Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.mobile_15thdec.test_mysql;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;




/**
 * Table2 generated by hbm2java
 */
@Entity
@Table(name="`TABLE2`"
    ,schema="test_mysql"
)
public class Table2  implements java.io.Serializable
 {


private String column2;
private Integer id;

    public Table2() {
    }



     @Id 

    

    @Column(name="`COLUMN2`", nullable=false)
    public String getColumn2() {
        return this.column2;
    }
    
    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    

    @Column(name="`ID`", nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }



public boolean equals(Object o) {
         if (this == o)
         return true;
		 if ( (o == null ) )
		 return false;
		 if ( !(o instanceof Table2) )
		 return false;

		 Table2 that = ( Table2 ) o;

		 return ( (this.getColumn2()==that.getColumn2()) || ( this.getColumn2()!=null && that.getColumn2()!=null && this.getColumn2().equals(that.getColumn2()) ) );

   }

   public int hashCode() {
         int result = 17;

         result = 37 * result + ( getColumn2() == null ? 0 : this.getColumn2().hashCode() );

         return result;
     }


}

