<div class="file-content code js-syntax-highlight white" id="blob-content">
    <div class="line-numbers">
        <a class="file-line-num diff-line-num"
           data-line-number="1"
           id="L1" href="#L1">1</a><a class="file-line-num diff-line-num"
           data-line-number="2"
           id="L2" href="#L2">2</a><a class="file-line-num diff-line-num"
           data-line-number="3"
           id="L3" href="#L3">3</a><a class="file-line-num diff-line-num"
           data-line-number="4"
           id="L4" href="#L4">4</a><a class="file-line-num diff-line-num"
           data-line-number="5"
           id="L5" href="#L5">5</a><a class="file-line-num diff-line-num"
           data-line-number="6"
           id="L6" href="#L6">6</a><a class="file-line-num diff-line-num"
           data-line-number="7"
           id="L7" href="#L7">7</a><a class="file-line-num diff-line-num"
           data-line-number="8"
           id="L8" href="#L8">8</a><a class="file-line-num diff-line-num"
           data-line-number="9"
           id="L9" href="#L9">9</a><a class="file-line-num diff-line-num"
           data-line-number="10"
           id="L10" href="#L10">10</a><a class="file-line-num diff-line-num"
           data-line-number="11"
           id="L11" href="#L11">11</a><a class="file-line-num diff-line-num"
           data-line-number="12"
           id="L12" href="#L12">12</a><a class="file-line-num diff-line-num"
           data-line-number="13"
           id="L13" href="#L13">13</a><a class="file-line-num diff-line-num"
           data-line-number="14"
           id="L14" href="#L14">14</a><a class="file-line-num diff-line-num"
           data-line-number="15"
           id="L15" href="#L15">15</a><a class="file-line-num diff-line-num"
           data-line-number="16"
           id="L16" href="#L16">16</a><a class="file-line-num diff-line-num"
           data-line-number="17"
           id="L17" href="#L17">17</a><a class="file-line-num diff-line-num"
           data-line-number="18"
           id="L18" href="#L18">18</a><a class="file-line-num diff-line-num"
           data-line-number="19"
           id="L19" href="#L19">19</a><a class="file-line-num diff-line-num"
           data-line-number="20"
           id="L20" href="#L20">20</a><a class="file-line-num diff-line-num"
           data-line-number="21"
           id="L21" href="#L21">21</a><a class="file-line-num diff-line-num"
           data-line-number="22"
           id="L22" href="#L22">22</a><a class="file-line-num diff-line-num"
           data-line-number="23"
           id="L23" href="#L23">23</a><a class="file-line-num diff-line-num"
           data-line-number="24"
           id="L24" href="#L24">24</a><a class="file-line-num diff-line-num"
           data-line-number="25"
           id="L25" href="#L25">25</a><a class="file-line-num diff-line-num"
           data-line-number="26"
           id="L26" href="#L26">26</a><a class="file-line-num diff-line-num"
           data-line-number="27"
           id="L27" href="#L27">27</a><a class="file-line-num diff-line-num"
           data-line-number="28"
           id="L28" href="#L28">28</a><a class="file-line-num diff-line-num"
           data-line-number="29"
           id="L29" href="#L29">29</a><a class="file-line-num diff-line-num"
           data-line-number="30"
           id="L30" href="#L30">30</a><a class="file-line-num diff-line-num"
           data-line-number="31"
           id="L31" href="#L31">31</a><a class="file-line-num diff-line-num"
           data-line-number="32"
           id="L32" href="#L32">32</a><a class="file-line-num diff-line-num"
           data-line-number="33"
           id="L33" href="#L33">33</a><a class="file-line-num diff-line-num"
           data-line-number="34"
           id="L34" href="#L34">34</a><a class="file-line-num diff-line-num"
           data-line-number="35"
           id="L35" href="#L35">35</a><a class="file-line-num diff-line-num"
           data-line-number="36"
           id="L36" href="#L36">36</a><a class="file-line-num diff-line-num"
           data-line-number="37"
           id="L37" href="#L37">37</a><a class="file-line-num diff-line-num"
           data-line-number="38"
           id="L38" href="#L38">38</a><a class="file-line-num diff-line-num"
           data-line-number="39"
           id="L39" href="#L39">39</a><a class="file-line-num diff-line-num"
           data-line-number="40"
           id="L40" href="#L40">40</a>
    </div>
    <div class="blob-content"
         data-blob-id="5afbd23d0e021a57af5234311b7287d5ca25c727"
         data-path="src/main/java/main/repo/EmployeeRepo.java"
         data-qa-selector="file_content">
<pre class="code highlight">
<code>
<span class="line" lang="java" id="LC1"><span class="cm">/*</span></span><span class="line" lang="java" id="LC2"><span class="cm"> * Licensed to the Apache Software Foundation (ASF) under one or more</span></span><span class="line" lang="java" id="LC3"><span class="cm"> * contributor license agreements.  See the NOTICE file distributed with</span></span><span class="line" lang="java" id="LC4"><span class="cm"> * this work for additional information regarding copyright ownership.</span></span><span class="line" lang="java" id="LC5"><span class="cm"> * The ASF licenses this file to You under the Apache License, Version 2.0</span></span><span class="line" lang="java" id="LC6"><span class="cm"> * (the &quot;License&quot;); you may not use this file except in compliance with</span></span><span class="line" lang="java" id="LC7"><span class="cm"> * the License.  You may obtain a copy of the License at</span></span><span class="line" lang="java" id="LC8"><span class="cm"> *</span></span><span class="line" lang="java" id="LC9"><span class="cm"> *      http://www.apache.org/licenses/LICENSE-2.0</span></span><span class="line" lang="java" id="LC10"><span class="cm"> *</span></span><span class="line" lang="java" id="LC11"><span class="cm"> * Unless required by applicable law or agreed to in writing, software</span></span><span class="line" lang="java" id="LC12"><span class="cm"> * distributed under the License is distributed on an &quot;AS IS&quot; BASIS,</span></span><span class="line" lang="java" id="LC13"><span class="cm"> * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.</span></span><span class="line" lang="java" id="LC14"><span class="cm"> * See the License for the specific language governing permissions and</span></span><span class="line" lang="java" id="LC15"><span class="cm"> * limitations under the License.</span></span><span class="line" lang="java" id="LC16"><span class="cm"> */</span></span><span class="line" lang="java" id="LC17"></span><span class="line" lang="java" id="LC18"><span class="kn">package</span><span> </span><span>org.apache.commons.lang3.function</span><span>;</span></span><span class="line" lang="java" id="LC19"></span><span class="line" lang="java" id="LC20"><span class="kn">import</span><span> </span><span>java.util.function.DoubleBinaryOperator</span><span>;</span></span><span class="line" lang="java" id="LC21"></span><span class="line" lang="java" id="LC22"><span class="cm">/**</span></span><span class="line" lang="java" id="LC23"><span class="cm"> * A functional interface like {@link DoubleBinaryOperator} that declares a {@code Throwable}.</span></span><span class="line" lang="java" id="LC24"><span class="cm"> *</span></span><span class="line" lang="java" id="LC25"><span class="cm"> * @param &lt;E&gt; Thrown exception.</span></span><span class="line" lang="java" id="LC26"><span class="cm"> * @since 3.11</span></span><span class="line" lang="java" id="LC27"><span class="cm"> */</span></span><span class="line" lang="java" id="LC28"><span>@FunctionalInterface</span></span><span class="line" lang="java" id="LC29"><span class="kd">public</span><span> </span><span class="kd">interface</span><span> </span><span class="nc">FailableDoubleBinaryOperator</span><span>&lt;</span><span>E</span><span> </span><span class="kd">extends</span><span> </span><span>Throwable</span><span>&gt;</span><span> </span><span>{</span></span><span class="line" lang="java" id="LC30"></span><span class="line" lang="java" id="LC31"><span>    </span><span class="cm">/**</span></span><span class="line" lang="java" id="LC32"><span class="cm">     * Applies this operator to the given operands.</span></span><span class="line" lang="java" id="LC33"><span class="cm">     *</span></span><span class="line" lang="java" id="LC34"><span class="cm">     * @param left the first operand</span></span><span class="line" lang="java" id="LC35"><span class="cm">     * @param right the second operand</span></span><span class="line" lang="java" id="LC36"><span class="cm">     * @return the operator result</span></span><span class="line" lang="java" id="LC37"><span class="cm">     * @throws E if the operation fails</span></span><span class="line" lang="java" id="LC38"><span class="cm">     */</span></span><span class="line" lang="java" id="LC39"><span>    </span><span>double</span><span> </span><span>applyAsDouble</span><span>(</span><span>double</span><span> </span><span>left</span><span>,</span><span> </span><span>double</span><span> </span><span>right</span><span>)</span><span> </span><span class="kd">throws</span><span> </span><span>E</span><span>;</span></span><span class="line" lang="java" id="LC40"><span>}</span></span>
</code>
</pre>
    </div>
</div>