<div class="blob-viewer" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-type="simple" data-url="/redhat/centos-stream/src/apache-commons-lang3/-/blob/c8s-stream-3.6/src/main/java/org/apache/commons/lang3/StringUtils.java?format=json&amp;viewer=simple" data-loaded="true"><div class="blob-viewer" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-type="simple">
<div class="file-content code js-syntax-highlight white" id="blob-content">
<div class="line-numbers">
<a class="file-line-num diff-line-num" data-line-number="1" href="#L1" id="L1">
1
</a>
<a class="file-line-num diff-line-num" data-line-number="2" href="#L2" id="L2">
2
</a>
<a class="file-line-num diff-line-num" data-line-number="3" href="#L3" id="L3">
3
</a>
<a class="file-line-num diff-line-num" data-line-number="4" href="#L4" id="L4">
4
</a>
<a class="file-line-num diff-line-num" data-line-number="5" href="#L5" id="L5">
5
</a>
<a class="file-line-num diff-line-num" data-line-number="6" href="#L6" id="L6">
6
</a>
<a class="file-line-num diff-line-num" data-line-number="7" href="#L7" id="L7">
7
</a>
<a class="file-line-num diff-line-num" data-line-number="8" href="#L8" id="L8">
8
</a>
<a class="file-line-num diff-line-num" data-line-number="9" href="#L9" id="L9">
9
</a>
<a class="file-line-num diff-line-num" data-line-number="10" href="#L10" id="L10">
10
</a>
<a class="file-line-num diff-line-num" data-line-number="11" href="#L11" id="L11">
11
</a>
<a class="file-line-num diff-line-num" data-line-number="12" href="#L12" id="L12">
12
</a>
<a class="file-line-num diff-line-num" data-line-number="13" href="#L13" id="L13">
13
</a>
<a class="file-line-num diff-line-num" data-line-number="14" href="#L14" id="L14">
14
</a>
<a class="file-line-num diff-line-num" data-line-number="15" href="#L15" id="L15">
15
</a>
<a class="file-line-num diff-line-num" data-line-number="16" href="#L16" id="L16">
16
</a>
<a class="file-line-num diff-line-num" data-line-number="17" href="#L17" id="L17">
17
</a>
<a class="file-line-num diff-line-num" data-line-number="18" href="#L18" id="L18">
18
</a>
<a class="file-line-num diff-line-num" data-line-number="19" href="#L19" id="L19">
19
</a>
<a class="file-line-num diff-line-num" data-line-number="20" href="#L20" id="L20">
20
</a>
<a class="file-line-num diff-line-num" data-line-number="21" href="#L21" id="L21">
21
</a>
<a class="file-line-num diff-line-num" data-line-number="22" href="#L22" id="L22">
22
</a>
<a class="file-line-num diff-line-num" data-line-number="23" href="#L23" id="L23">
23
</a>
<a class="file-line-num diff-line-num" data-line-number="24" href="#L24" id="L24">
24
</a>
<a class="file-line-num diff-line-num" data-line-number="25" href="#L25" id="L25">
25
</a>
<a class="file-line-num diff-line-num" data-line-number="26" href="#L26" id="L26">
26
</a>
<a class="file-line-num diff-line-num" data-line-number="27" href="#L27" id="L27">
27
</a>
<a class="file-line-num diff-line-num" data-line-number="28" href="#L28" id="L28">
28
</a>
<a class="file-line-num diff-line-num" data-line-number="29" href="#L29" id="L29">
29
</a>
<a class="file-line-num diff-line-num" data-line-number="30" href="#L30" id="L30">
30
</a>
<a class="file-line-num diff-line-num" data-line-number="31" href="#L31" id="L31">
31
</a>
<a class="file-line-num diff-line-num" data-line-number="32" href="#L32" id="L32">
32
</a>
<a class="file-line-num diff-line-num" data-line-number="33" href="#L33" id="L33">
33
</a>
<a class="file-line-num diff-line-num" data-line-number="34" href="#L34" id="L34">
34
</a>
<a class="file-line-num diff-line-num" data-line-number="35" href="#L35" id="L35">
35
</a>
<a class="file-line-num diff-line-num" data-line-number="36" href="#L36" id="L36">
36
</a>
<a class="file-line-num diff-line-num" data-line-number="37" href="#L37" id="L37">
37
</a>
<a class="file-line-num diff-line-num" data-line-number="38" href="#L38" id="L38">
38
</a>
<a class="file-line-num diff-line-num" data-line-number="39" href="#L39" id="L39">
39
</a>
<a class="file-line-num diff-line-num" data-line-number="40" href="#L40" id="L40">
40
</a>
<a class="file-line-num diff-line-num" data-line-number="41" href="#L41" id="L41">
41
</a>
<a class="file-line-num diff-line-num" data-line-number="42" href="#L42" id="L42">
42
</a>
<a class="file-line-num diff-line-num" data-line-number="43" href="#L43" id="L43">
43
</a>
<a class="file-line-num diff-line-num" data-line-number="44" href="#L44" id="L44">
44
</a>
<a class="file-line-num diff-line-num" data-line-number="45" href="#L45" id="L45">
45
</a>
</div>
<div class="blob-content" data-blob-id="01dd3290f8c8cbdeab0a2428d8b775a16a063bc5" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-qa-selector="file_content">
<pre class="code highlight"><code><span id="LC1" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC2" class="line" lang="java"><span class="cm"> * Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved.</span></span>
<span id="LC3" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC4" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC5" class="line" lang="java"><span class="cm"> * Licensed to the Apache Software Foundation (ASF) under one or more</span></span>
<span id="LC6" class="line" lang="java"><span class="cm"> * contributor license agreements.  See the NOTICE file distributed with</span></span>
<span id="LC7" class="line" lang="java"><span class="cm"> * this work for additional information regarding copyright ownership.</span></span>
<span id="LC8" class="line" lang="java"><span class="cm"> * The ASF licenses this file to You under the Apache License, Version 2.0</span></span>
<span id="LC9" class="line" lang="java"><span class="cm"> * (the "License"); you may not use this file except in compliance with</span></span>
<span id="LC10" class="line" lang="java"><span class="cm"> * the License.  You may obtain a copy of the License at</span></span>
<span id="LC11" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC12" class="line" lang="java"><span class="cm"> *      http://www.apache.org/licenses/LICENSE-2.0</span></span>
<span id="LC13" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC14" class="line" lang="java"><span class="cm"> * Unless required by applicable law or agreed to in writing, software</span></span>
<span id="LC15" class="line" lang="java"><span class="cm"> * distributed under the License is distributed on an "AS IS" BASIS,</span></span>
<span id="LC16" class="line" lang="java"><span class="cm"> * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.</span></span>
<span id="LC17" class="line" lang="java"><span class="cm"> * See the License for the specific language governing permissions and</span></span>
<span id="LC18" class="line" lang="java"><span class="cm"> * limitations under the License.</span></span>
<span id="LC19" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC20" class="line" lang="java"><span class="kn">package</span> <span class="nn">com.sun.org.apache.xerces.internal.util</span><span class="o">;</span></span>
<span id="LC21" class="line" lang="java"></span>
<span id="LC22" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.util.Random</span><span class="o">;</span></span>
<span id="LC23" class="line" lang="java"></span>
<span id="LC24" class="line" lang="java"> <span class="cm">/**</span></span>
<span id="LC25" class="line" lang="java"><span class="cm"> * Fills an array with a random sequence of prime numbers.</span></span>
<span id="LC26" class="line" lang="java"><span class="cm">  */</span></span>
<span id="LC27" class="line" lang="java"><span class="kd">final</span> <span class="kd">class</span> <span class="nc">PrimeNumberSequenceGenerator</span> <span class="o">{</span></span>
<span id="LC28" class="line" lang="java"></span>
<span id="LC29" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="o">[]</span> <span class="no">PRIMES</span> <span class="o">=</span> <span class="o">{</span></span>
<span id="LC30" class="line" lang="java">        <span class="mi">3</span><span class="o">,</span>   <span class="mi">5</span><span class="o">,</span>   <span class="mi">7</span><span class="o">,</span>  <span class="mi">11</span><span class="o">,</span>  <span class="mi">13</span><span class="o">,</span>  <span class="mi">17</span><span class="o">,</span>  <span class="mi">19</span><span class="o">,</span>  <span class="mi">23</span><span class="o">,</span>  <span class="mi">29</span><span class="o">,</span>  <span class="mi">31</span><span class="o">,</span>  <span class="mi">37</span><span class="o">,</span>  <span class="mi">41</span><span class="o">,</span>  <span class="mi">43</span><span class="o">,</span>  <span class="mi">47</span><span class="o">,</span>  <span class="mi">53</span><span class="o">,</span>  <span class="mi">59</span><span class="o">,</span></span>
<span id="LC31" class="line" lang="java">       <span class="mi">61</span><span class="o">,</span>  <span class="mi">67</span><span class="o">,</span>  <span class="mi">71</span><span class="o">,</span>  <span class="mi">73</span><span class="o">,</span>  <span class="mi">79</span><span class="o">,</span>  <span class="mi">83</span><span class="o">,</span>  <span class="mi">89</span><span class="o">,</span>  <span class="mi">97</span><span class="o">,</span> <span class="mi">101</span><span class="o">,</span> <span class="mi">103</span><span class="o">,</span> <span class="mi">107</span><span class="o">,</span> <span class="mi">109</span><span class="o">,</span> <span class="mi">113</span><span class="o">,</span> <span class="mi">127</span><span class="o">,</span> <span class="mi">131</span><span class="o">,</span> <span class="mi">137</span><span class="o">,</span></span>
<span id="LC32" class="line" lang="java">      <span class="mi">139</span><span class="o">,</span> <span class="mi">149</span><span class="o">,</span> <span class="mi">151</span><span class="o">,</span> <span class="mi">157</span><span class="o">,</span> <span class="mi">163</span><span class="o">,</span> <span class="mi">167</span><span class="o">,</span> <span class="mi">173</span><span class="o">,</span> <span class="mi">179</span><span class="o">,</span> <span class="mi">181</span><span class="o">,</span> <span class="mi">191</span><span class="o">,</span> <span class="mi">193</span><span class="o">,</span> <span class="mi">197</span><span class="o">,</span> <span class="mi">199</span><span class="o">,</span> <span class="mi">211</span><span class="o">,</span> <span class="mi">223</span><span class="o">,</span> <span class="mi">227</span><span class="o">,</span></span>
<span id="LC33" class="line" lang="java">      <span class="mi">229</span><span class="o">,</span> <span class="mi">233</span><span class="o">,</span> <span class="mi">239</span><span class="o">,</span> <span class="mi">241</span><span class="o">,</span> <span class="mi">251</span><span class="o">,</span> <span class="mi">257</span><span class="o">,</span> <span class="mi">263</span><span class="o">,</span> <span class="mi">269</span><span class="o">,</span> <span class="mi">271</span><span class="o">,</span> <span class="mi">277</span><span class="o">,</span> <span class="mi">281</span><span class="o">,</span> <span class="mi">283</span><span class="o">,</span> <span class="mi">293</span><span class="o">,</span> <span class="mi">307</span><span class="o">,</span> <span class="mi">311</span><span class="o">,</span> <span class="mi">313</span><span class="o">,</span></span>
<span id="LC34" class="line" lang="java">      <span class="mi">317</span><span class="o">,</span> <span class="mi">331</span><span class="o">,</span> <span class="mi">337</span><span class="o">,</span> <span class="mi">347</span><span class="o">,</span> <span class="mi">349</span><span class="o">,</span> <span class="mi">353</span><span class="o">,</span> <span class="mi">359</span><span class="o">,</span> <span class="mi">367</span><span class="o">,</span> <span class="mi">373</span><span class="o">,</span> <span class="mi">379</span><span class="o">,</span> <span class="mi">383</span><span class="o">,</span> <span class="mi">389</span><span class="o">,</span> <span class="mi">397</span><span class="o">,</span> <span class="mi">401</span><span class="o">,</span> <span class="mi">409</span><span class="o">,</span> <span class="mi">419</span><span class="o">,</span></span>
<span id="LC35" class="line" lang="java">      <span class="mi">421</span><span class="o">,</span> <span class="mi">431</span><span class="o">,</span> <span class="mi">433</span><span class="o">,</span> <span class="mi">439</span><span class="o">,</span> <span class="mi">443</span><span class="o">,</span> <span class="mi">449</span><span class="o">,</span> <span class="mi">457</span><span class="o">,</span> <span class="mi">461</span><span class="o">,</span> <span class="mi">463</span><span class="o">,</span> <span class="mi">467</span><span class="o">,</span> <span class="mi">479</span><span class="o">,</span> <span class="mi">487</span><span class="o">,</span> <span class="mi">491</span><span class="o">,</span> <span class="mi">499</span><span class="o">,</span> <span class="mi">503</span><span class="o">,</span> <span class="mi">509</span><span class="o">,</span></span>
<span id="LC36" class="line" lang="java">      <span class="mi">521</span><span class="o">,</span> <span class="mi">523</span><span class="o">,</span> <span class="mi">541</span><span class="o">,</span> <span class="mi">547</span><span class="o">,</span> <span class="mi">557</span><span class="o">,</span> <span class="mi">563</span><span class="o">,</span> <span class="mi">569</span><span class="o">,</span> <span class="mi">571</span><span class="o">,</span> <span class="mi">577</span><span class="o">,</span> <span class="mi">587</span><span class="o">,</span> <span class="mi">593</span><span class="o">,</span> <span class="mi">599</span><span class="o">,</span> <span class="mi">601</span><span class="o">,</span> <span class="mi">607</span><span class="o">,</span> <span class="mi">613</span><span class="o">,</span> <span class="mi">617</span><span class="o">,</span></span>
<span id="LC37" class="line" lang="java">      <span class="mi">619</span><span class="o">,</span> <span class="mi">631</span><span class="o">,</span> <span class="mi">641</span><span class="o">,</span> <span class="mi">643</span><span class="o">,</span> <span class="mi">647</span><span class="o">,</span> <span class="mi">653</span><span class="o">,</span> <span class="mi">659</span><span class="o">,</span> <span class="mi">661</span><span class="o">,</span> <span class="mi">673</span><span class="o">,</span> <span class="mi">677</span><span class="o">,</span> <span class="mi">683</span><span class="o">,</span> <span class="mi">691</span><span class="o">,</span> <span class="mi">701</span><span class="o">,</span> <span class="mi">709</span><span class="o">,</span> <span class="mi">719</span><span class="o">,</span> <span class="mi">727</span><span class="o">};</span></span>
<span id="LC38" class="line" lang="java"></span>
<span id="LC39" class="line" lang="java">    <span class="kd">static</span> <span class="kt">void</span> <span class="nf">generateSequence</span><span class="o">(</span><span class="kt">int</span><span class="o">[]</span> <span class="n">arrayToFill</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC40" class="line" lang="java">        <span class="nc">Random</span> <span class="n">r</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">Random</span><span class="o">();</span></span>
<span id="LC41" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">arrayToFill</span><span class="o">.</span><span class="na">length</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span></span>
<span id="LC42" class="line" lang="java">            <span class="n">arrayToFill</span><span class="o">[</span><span class="n">i</span><span class="o">]</span> <span class="o">=</span> <span class="no">PRIMES</span><span class="o">[</span><span class="n">r</span><span class="o">.</span><span class="na">nextInt</span><span class="o">(</span><span class="no">PRIMES</span><span class="o">.</span><span class="na">length</span><span class="o">)];</span></span>
<span id="LC43" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC44" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC45" class="line" lang="java"><span class="o">}</span></span>
