package com.smartdevicelink.rpc.datatypes;

import java.util.Hashtable;

import com.smartdevicelink.proxy.RpcStruct;
import com.smartdevicelink.rpc.enums.VehicleDataResultCode;

public class DidResult extends RpcStruct {
	public static final String KEY_RESULT_CODE = "resultCode";
	public static final String KEY_DATA = "data";
	public static final String KEY_DID_LOCATION = "didLocation";
	
    public DidResult() {}
    public DidResult(Hashtable<String, Object> hash) {
        super(hash);
    }
    public void setResultCode(VehicleDataResultCode resultCode) {
    	if (resultCode != null) {
    		store.put(KEY_RESULT_CODE, resultCode);
    	} else {
    		store.remove(KEY_RESULT_CODE);
    	}
    }
    public VehicleDataResultCode getResultCode() {
        Object obj = store.get(KEY_RESULT_CODE);
        if (obj instanceof VehicleDataResultCode) {
            return (VehicleDataResultCode) obj;
        } else if (obj instanceof String) {
        	return VehicleDataResultCode.valueForString((String) obj);
        }
        return null;
    }
    public void setDidLocation(Integer didLocation) {
    	if (didLocation != null) {
    		store.put(KEY_DID_LOCATION, didLocation);
    	} else {
    		store.remove(KEY_DID_LOCATION);
    	}
    }
    public Integer getDidLocation() {
    	return (Integer) store.get(KEY_DID_LOCATION);
    }    
    public void setData(String data) {
    	if (data != null) {
    		store.put(KEY_DATA, data);
    	} else {
    		store.remove(KEY_DATA);
    	}
    }
    public String getData() {
    	return (String) store.get(KEY_DATA);
    }
}