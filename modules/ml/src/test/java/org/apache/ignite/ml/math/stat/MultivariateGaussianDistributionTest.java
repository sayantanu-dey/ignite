/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.ml.math.stat;

import org.apache.ignite.ml.math.primitives.matrix.impl.DenseMatrix;
import org.apache.ignite.ml.math.primitives.vector.VectorUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for {@link MultivariateGaussianDistribution}.
 */
public class MultivariateGaussianDistributionTest {
    /** */
    @Test
    public void testApply() {
        MultivariateGaussianDistribution distribution = new MultivariateGaussianDistribution(
            VectorUtils.of(1, 2),
            new DenseMatrix(new double[][] {new double[] {1, -0.5}, new double[] {-0.5, 1}})
        );

        Assert.assertEquals(0.183, distribution.prob(VectorUtils.of(1, 2)), 0.01);
        Assert.assertEquals(0.094, distribution.prob(VectorUtils.of(0, 2)), 0.01);
    }
}
