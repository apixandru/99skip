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
<a class="file-line-num diff-line-num" data-line-number="46" href="#L46" id="L46">
46
</a>
<a class="file-line-num diff-line-num" data-line-number="47" href="#L47" id="L47">
47
</a>
<a class="file-line-num diff-line-num" data-line-number="48" href="#L48" id="L48">
48
</a>
<a class="file-line-num diff-line-num" data-line-number="49" href="#L49" id="L49">
49
</a>
<a class="file-line-num diff-line-num" data-line-number="50" href="#L50" id="L50">
50
</a>
<a class="file-line-num diff-line-num" data-line-number="51" href="#L51" id="L51">
51
</a>
<a class="file-line-num diff-line-num" data-line-number="52" href="#L52" id="L52">
52
</a>
<a class="file-line-num diff-line-num" data-line-number="53" href="#L53" id="L53">
53
</a>
<a class="file-line-num diff-line-num" data-line-number="54" href="#L54" id="L54">
54
</a>
<a class="file-line-num diff-line-num" data-line-number="55" href="#L55" id="L55">
55
</a>
<a class="file-line-num diff-line-num" data-line-number="56" href="#L56" id="L56">
56
</a>
</div>
<div class="blob-content" data-blob-id="01dd3290f8c8cbdeab0a2428d8b775a16a063bc5" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-qa-selector="file_content">
<pre class="code highlight"><code><span id="LC1" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC2" class="line" lang="java"><span class="cm"> * Copyright (c) 2017, Oracle and/or its affiliates. All rights reserved.</span></span>
<span id="LC3" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC4" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC5" class="line" lang="java"><span class="cm"> * Copyright 2001-2004 The Apache Software Foundation.</span></span>
<span id="LC6" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC7" class="line" lang="java"><span class="cm"> * Licensed under the Apache License, Version 2.0 (the "License");</span></span>
<span id="LC8" class="line" lang="java"><span class="cm"> * you may not use this file except in compliance with the License.</span></span>
<span id="LC9" class="line" lang="java"><span class="cm"> * You may obtain a copy of the License at</span></span>
<span id="LC10" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC11" class="line" lang="java"><span class="cm"> *     http://www.apache.org/licenses/LICENSE-2.0</span></span>
<span id="LC12" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC13" class="line" lang="java"><span class="cm"> * Unless required by applicable law or agreed to in writing, software</span></span>
<span id="LC14" class="line" lang="java"><span class="cm"> * distributed under the License is distributed on an "AS IS" BASIS,</span></span>
<span id="LC15" class="line" lang="java"><span class="cm"> * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.</span></span>
<span id="LC16" class="line" lang="java"><span class="cm"> * See the License for the specific language governing permissions and</span></span>
<span id="LC17" class="line" lang="java"><span class="cm"> * limitations under the License.</span></span>
<span id="LC18" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC19" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC20" class="line" lang="java"><span class="cm"> * $Id: Translet.java,v 1.2.4.1 2005/08/31 10:46:27 pvedula Exp $</span></span>
<span id="LC21" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC22" class="line" lang="java"></span>
<span id="LC23" class="line" lang="java"><span class="kn">package</span> <span class="nn">com.sun.org.apache.xalan.internal.xsltc</span><span class="o">;</span></span>
<span id="LC24" class="line" lang="java"></span>
<span id="LC25" class="line" lang="java"><span class="kn">import</span> <span class="nn">com.sun.org.apache.xml.internal.dtm.DTMAxisIterator</span><span class="o">;</span></span>
<span id="LC26" class="line" lang="java"><span class="kn">import</span> <span class="nn">com.sun.org.apache.xml.internal.serializer.SerializationHandler</span><span class="o">;</span></span>
<span id="LC27" class="line" lang="java"></span>
<span id="LC28" class="line" lang="java"><span class="cm">/**</span></span>
<span id="LC29" class="line" lang="java"><span class="cm"> * @author Jacek Ambroziak</span></span>
<span id="LC30" class="line" lang="java"><span class="cm"> * @author Santiago Pericas-Geertsen</span></span>
<span id="LC31" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC32" class="line" lang="java"><span class="kd">public</span> <span class="kd">interface</span> <span class="nc">Translet</span> <span class="o">{</span></span>
<span id="LC33" class="line" lang="java"></span>
<span id="LC34" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">transform</span><span class="o">(</span><span class="no">DOM</span> <span class="n">document</span><span class="o">,</span> <span class="nc">SerializationHandler</span> <span class="n">handler</span><span class="o">)</span></span>
<span id="LC35" class="line" lang="java">        <span class="kd">throws</span> <span class="nc">TransletException</span><span class="o">;</span></span>
<span id="LC36" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">transform</span><span class="o">(</span><span class="no">DOM</span> <span class="n">document</span><span class="o">,</span> <span class="nc">SerializationHandler</span><span class="o">[]</span> <span class="n">handlers</span><span class="o">)</span></span>
<span id="LC37" class="line" lang="java">        <span class="kd">throws</span> <span class="nc">TransletException</span><span class="o">;</span></span>
<span id="LC38" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">transform</span><span class="o">(</span><span class="no">DOM</span> <span class="n">document</span><span class="o">,</span> <span class="nc">DTMAxisIterator</span> <span class="n">iterator</span><span class="o">,</span></span>
<span id="LC39" class="line" lang="java">                          <span class="nc">SerializationHandler</span> <span class="n">handler</span><span class="o">)</span></span>
<span id="LC40" class="line" lang="java">        <span class="kd">throws</span> <span class="nc">TransletException</span><span class="o">;</span></span>
<span id="LC41" class="line" lang="java"></span>
<span id="LC42" class="line" lang="java">    <span class="kd">public</span> <span class="nc">Object</span> <span class="nf">addParameter</span><span class="o">(</span><span class="nc">String</span> <span class="n">name</span><span class="o">,</span> <span class="nc">Object</span> <span class="n">value</span><span class="o">);</span></span>
<span id="LC43" class="line" lang="java"></span>
<span id="LC44" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">buildKeys</span><span class="o">(</span><span class="no">DOM</span> <span class="n">document</span><span class="o">,</span> <span class="nc">DTMAxisIterator</span> <span class="n">iterator</span><span class="o">,</span></span>
<span id="LC45" class="line" lang="java">                          <span class="nc">SerializationHandler</span> <span class="n">handler</span><span class="o">,</span> <span class="kt">int</span> <span class="n">root</span><span class="o">)</span></span>
<span id="LC46" class="line" lang="java">        <span class="kd">throws</span> <span class="nc">TransletException</span><span class="o">;</span></span>
<span id="LC47" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">addAuxiliaryClass</span><span class="o">(</span><span class="nc">Class</span> <span class="n">auxClass</span><span class="o">);</span></span>
<span id="LC48" class="line" lang="java">    <span class="kd">public</span> <span class="nc">Class</span> <span class="nf">getAuxiliaryClass</span><span class="o">(</span><span class="nc">String</span> <span class="n">className</span><span class="o">);</span></span>
<span id="LC49" class="line" lang="java">    <span class="kd">public</span> <span class="nc">String</span><span class="o">[]</span> <span class="nf">getNamesArray</span><span class="o">();</span></span>
<span id="LC50" class="line" lang="java">    <span class="kd">public</span> <span class="nc">String</span><span class="o">[]</span> <span class="nf">getUrisArray</span><span class="o">();</span></span>
<span id="LC51" class="line" lang="java">    <span class="kd">public</span> <span class="kt">int</span><span class="o">[]</span>    <span class="nf">getTypesArray</span><span class="o">();</span></span>
<span id="LC52" class="line" lang="java">    <span class="kd">public</span> <span class="nc">String</span><span class="o">[]</span> <span class="nf">getNamespaceArray</span><span class="o">();</span></span>
<span id="LC53" class="line" lang="java">    <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">overrideDefaultParser</span><span class="o">();</span></span>
<span id="LC54" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setOverrideDefaultParser</span><span class="o">(</span><span class="kt">boolean</span> <span class="n">flag</span><span class="o">);</span></span>
<span id="LC55" class="line" lang="java"></span>
<span id="LC56" class="line" lang="java"><span class="o">}</span></span>
