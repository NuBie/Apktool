/**
 *  Copyright 2016 Pierre-Hugues Husson <phh@phh.me>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package brut.androlib.res.data.value;

import brut.androlib.AndrolibException;
import brut.androlib.res.data.ResResource;
import brut.androlib.res.xml.ResValuesXmlSerializable;
import java.io.IOException;
import org.xmlpull.v1.XmlSerializer;

public class ResEmptyValue extends ResScalarValue {
    protected final int mValue;
    private int type;

    public ResEmptyValue(int value, String rawValue, int type) {
        this(value, rawValue, "integer");
        this.type = type;
    }

    public ResEmptyValue(int value, String rawValue, String type) {
        super(type, value, rawValue);
		if(value != 1)
			throw new UnsupportedOperationException();
        this.mValue = value;
    }

    public int getValue() {
        return mValue;
    }

    @Override
    protected String encodeAsResXml() throws AndrolibException {
        return "@empty";
    }
}
