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
<a class="file-line-num diff-line-num" data-line-number="57" href="#L57" id="L57">
57
</a>
<a class="file-line-num diff-line-num" data-line-number="58" href="#L58" id="L58">
58
</a>
<a class="file-line-num diff-line-num" data-line-number="59" href="#L59" id="L59">
59
</a>
<a class="file-line-num diff-line-num" data-line-number="60" href="#L60" id="L60">
60
</a>
<a class="file-line-num diff-line-num" data-line-number="61" href="#L61" id="L61">
61
</a>
<a class="file-line-num diff-line-num" data-line-number="62" href="#L62" id="L62">
62
</a>
<a class="file-line-num diff-line-num" data-line-number="63" href="#L63" id="L63">
63
</a>
<a class="file-line-num diff-line-num" data-line-number="64" href="#L64" id="L64">
64
</a>
<a class="file-line-num diff-line-num" data-line-number="65" href="#L65" id="L65">
65
</a>
<a class="file-line-num diff-line-num" data-line-number="66" href="#L66" id="L66">
66
</a>
<a class="file-line-num diff-line-num" data-line-number="67" href="#L67" id="L67">
67
</a>
<a class="file-line-num diff-line-num" data-line-number="68" href="#L68" id="L68">
68
</a>
<a class="file-line-num diff-line-num" data-line-number="69" href="#L69" id="L69">
69
</a>
<a class="file-line-num diff-line-num" data-line-number="70" href="#L70" id="L70">
70
</a>
<a class="file-line-num diff-line-num" data-line-number="71" href="#L71" id="L71">
71
</a>
<a class="file-line-num diff-line-num" data-line-number="72" href="#L72" id="L72">
72
</a>
<a class="file-line-num diff-line-num" data-line-number="73" href="#L73" id="L73">
73
</a>
<a class="file-line-num diff-line-num" data-line-number="74" href="#L74" id="L74">
74
</a>
<a class="file-line-num diff-line-num" data-line-number="75" href="#L75" id="L75">
75
</a>
<a class="file-line-num diff-line-num" data-line-number="76" href="#L76" id="L76">
76
</a>
<a class="file-line-num diff-line-num" data-line-number="77" href="#L77" id="L77">
77
</a>
<a class="file-line-num diff-line-num" data-line-number="78" href="#L78" id="L78">
78
</a>
<a class="file-line-num diff-line-num" data-line-number="79" href="#L79" id="L79">
79
</a>
<a class="file-line-num diff-line-num" data-line-number="80" href="#L80" id="L80">
80
</a>
<a class="file-line-num diff-line-num" data-line-number="81" href="#L81" id="L81">
81
</a>
<a class="file-line-num diff-line-num" data-line-number="82" href="#L82" id="L82">
82
</a>
<a class="file-line-num diff-line-num" data-line-number="83" href="#L83" id="L83">
83
</a>
<a class="file-line-num diff-line-num" data-line-number="84" href="#L84" id="L84">
84
</a>
<a class="file-line-num diff-line-num" data-line-number="85" href="#L85" id="L85">
85
</a>
<a class="file-line-num diff-line-num" data-line-number="86" href="#L86" id="L86">
86
</a>
<a class="file-line-num diff-line-num" data-line-number="87" href="#L87" id="L87">
87
</a>
<a class="file-line-num diff-line-num" data-line-number="88" href="#L88" id="L88">
88
</a>
<a class="file-line-num diff-line-num" data-line-number="89" href="#L89" id="L89">
89
</a>
<a class="file-line-num diff-line-num" data-line-number="90" href="#L90" id="L90">
90
</a>
<a class="file-line-num diff-line-num" data-line-number="91" href="#L91" id="L91">
91
</a>
<a class="file-line-num diff-line-num" data-line-number="92" href="#L92" id="L92">
92
</a>
<a class="file-line-num diff-line-num" data-line-number="93" href="#L93" id="L93">
93
</a>
<a class="file-line-num diff-line-num" data-line-number="94" href="#L94" id="L94">
94
</a>
<a class="file-line-num diff-line-num" data-line-number="95" href="#L95" id="L95">
95
</a>
<a class="file-line-num diff-line-num" data-line-number="96" href="#L96" id="L96">
96
</a>
<a class="file-line-num diff-line-num" data-line-number="97" href="#L97" id="L97">
97
</a>
<a class="file-line-num diff-line-num" data-line-number="98" href="#L98" id="L98">
98
</a>
<a class="file-line-num diff-line-num" data-line-number="99" href="#L99" id="L99">
99
</a>
<a class="file-line-num diff-line-num" data-line-number="100" href="#L100" id="L100">
100
</a>
<a class="file-line-num diff-line-num" data-line-number="101" href="#L101" id="L101">
101
</a>
<a class="file-line-num diff-line-num" data-line-number="102" href="#L102" id="L102">
102
</a>
<a class="file-line-num diff-line-num" data-line-number="103" href="#L103" id="L103">
103
</a>
<a class="file-line-num diff-line-num" data-line-number="104" href="#L104" id="L104">
104
</a>
<a class="file-line-num diff-line-num" data-line-number="105" href="#L105" id="L105">
105
</a>
<a class="file-line-num diff-line-num" data-line-number="106" href="#L106" id="L106">
106
</a>
<a class="file-line-num diff-line-num" data-line-number="107" href="#L107" id="L107">
107
</a>
<a class="file-line-num diff-line-num" data-line-number="108" href="#L108" id="L108">
108
</a>
<a class="file-line-num diff-line-num" data-line-number="109" href="#L109" id="L109">
109
</a>
<a class="file-line-num diff-line-num" data-line-number="110" href="#L110" id="L110">
110
</a>
<a class="file-line-num diff-line-num" data-line-number="111" href="#L111" id="L111">
111
</a>
<a class="file-line-num diff-line-num" data-line-number="112" href="#L112" id="L112">
112
</a>
<a class="file-line-num diff-line-num" data-line-number="113" href="#L113" id="L113">
113
</a>
<a class="file-line-num diff-line-num" data-line-number="114" href="#L114" id="L114">
114
</a>
<a class="file-line-num diff-line-num" data-line-number="115" href="#L115" id="L115">
115
</a>
<a class="file-line-num diff-line-num" data-line-number="116" href="#L116" id="L116">
116
</a>
<a class="file-line-num diff-line-num" data-line-number="117" href="#L117" id="L117">
117
</a>
<a class="file-line-num diff-line-num" data-line-number="118" href="#L118" id="L118">
118
</a>
<a class="file-line-num diff-line-num" data-line-number="119" href="#L119" id="L119">
119
</a>
<a class="file-line-num diff-line-num" data-line-number="120" href="#L120" id="L120">
120
</a>
<a class="file-line-num diff-line-num" data-line-number="121" href="#L121" id="L121">
121
</a>
<a class="file-line-num diff-line-num" data-line-number="122" href="#L122" id="L122">
122
</a>
<a class="file-line-num diff-line-num" data-line-number="123" href="#L123" id="L123">
123
</a>
<a class="file-line-num diff-line-num" data-line-number="124" href="#L124" id="L124">
124
</a>
<a class="file-line-num diff-line-num" data-line-number="125" href="#L125" id="L125">
125
</a>
<a class="file-line-num diff-line-num" data-line-number="126" href="#L126" id="L126">
126
</a>
<a class="file-line-num diff-line-num" data-line-number="127" href="#L127" id="L127">
127
</a>
<a class="file-line-num diff-line-num" data-line-number="128" href="#L128" id="L128">
128
</a>
<a class="file-line-num diff-line-num" data-line-number="129" href="#L129" id="L129">
129
</a>
<a class="file-line-num diff-line-num" data-line-number="130" href="#L130" id="L130">
130
</a>
<a class="file-line-num diff-line-num" data-line-number="131" href="#L131" id="L131">
131
</a>
<a class="file-line-num diff-line-num" data-line-number="132" href="#L132" id="L132">
132
</a>
<a class="file-line-num diff-line-num" data-line-number="133" href="#L133" id="L133">
133
</a>
<a class="file-line-num diff-line-num" data-line-number="134" href="#L134" id="L134">
134
</a>
<a class="file-line-num diff-line-num" data-line-number="135" href="#L135" id="L135">
135
</a>
<a class="file-line-num diff-line-num" data-line-number="136" href="#L136" id="L136">
136
</a>
<a class="file-line-num diff-line-num" data-line-number="137" href="#L137" id="L137">
137
</a>
<a class="file-line-num diff-line-num" data-line-number="138" href="#L138" id="L138">
138
</a>
<a class="file-line-num diff-line-num" data-line-number="139" href="#L139" id="L139">
139
</a>
<a class="file-line-num diff-line-num" data-line-number="140" href="#L140" id="L140">
140
</a>
<a class="file-line-num diff-line-num" data-line-number="141" href="#L141" id="L141">
141
</a>
<a class="file-line-num diff-line-num" data-line-number="142" href="#L142" id="L142">
142
</a>
<a class="file-line-num diff-line-num" data-line-number="143" href="#L143" id="L143">
143
</a>
<a class="file-line-num diff-line-num" data-line-number="144" href="#L144" id="L144">
144
</a>
<a class="file-line-num diff-line-num" data-line-number="145" href="#L145" id="L145">
145
</a>
<a class="file-line-num diff-line-num" data-line-number="146" href="#L146" id="L146">
146
</a>
<a class="file-line-num diff-line-num" data-line-number="147" href="#L147" id="L147">
147
</a>
<a class="file-line-num diff-line-num" data-line-number="148" href="#L148" id="L148">
148
</a>
<a class="file-line-num diff-line-num" data-line-number="149" href="#L149" id="L149">
149
</a>
<a class="file-line-num diff-line-num" data-line-number="150" href="#L150" id="L150">
150
</a>
<a class="file-line-num diff-line-num" data-line-number="151" href="#L151" id="L151">
151
</a>
<a class="file-line-num diff-line-num" data-line-number="152" href="#L152" id="L152">
152
</a>
<a class="file-line-num diff-line-num" data-line-number="153" href="#L153" id="L153">
153
</a>
<a class="file-line-num diff-line-num" data-line-number="154" href="#L154" id="L154">
154
</a>
<a class="file-line-num diff-line-num" data-line-number="155" href="#L155" id="L155">
155
</a>
<a class="file-line-num diff-line-num" data-line-number="156" href="#L156" id="L156">
156
</a>
<a class="file-line-num diff-line-num" data-line-number="157" href="#L157" id="L157">
157
</a>
<a class="file-line-num diff-line-num" data-line-number="158" href="#L158" id="L158">
158
</a>
<a class="file-line-num diff-line-num" data-line-number="159" href="#L159" id="L159">
159
</a>
<a class="file-line-num diff-line-num" data-line-number="160" href="#L160" id="L160">
160
</a>
<a class="file-line-num diff-line-num" data-line-number="161" href="#L161" id="L161">
161
</a>
<a class="file-line-num diff-line-num" data-line-number="162" href="#L162" id="L162">
162
</a>
<a class="file-line-num diff-line-num" data-line-number="163" href="#L163" id="L163">
163
</a>
<a class="file-line-num diff-line-num" data-line-number="164" href="#L164" id="L164">
164
</a>
<a class="file-line-num diff-line-num" data-line-number="165" href="#L165" id="L165">
165
</a>
<a class="file-line-num diff-line-num" data-line-number="166" href="#L166" id="L166">
166
</a>
<a class="file-line-num diff-line-num" data-line-number="167" href="#L167" id="L167">
167
</a>
<a class="file-line-num diff-line-num" data-line-number="168" href="#L168" id="L168">
168
</a>
<a class="file-line-num diff-line-num" data-line-number="169" href="#L169" id="L169">
169
</a>
<a class="file-line-num diff-line-num" data-line-number="170" href="#L170" id="L170">
170
</a>
<a class="file-line-num diff-line-num" data-line-number="171" href="#L171" id="L171">
171
</a>
<a class="file-line-num diff-line-num" data-line-number="172" href="#L172" id="L172">
172
</a>
<a class="file-line-num diff-line-num" data-line-number="173" href="#L173" id="L173">
173
</a>
<a class="file-line-num diff-line-num" data-line-number="174" href="#L174" id="L174">
174
</a>
<a class="file-line-num diff-line-num" data-line-number="175" href="#L175" id="L175">
175
</a>
<a class="file-line-num diff-line-num" data-line-number="176" href="#L176" id="L176">
176
</a>
<a class="file-line-num diff-line-num" data-line-number="177" href="#L177" id="L177">
177
</a>
<a class="file-line-num diff-line-num" data-line-number="178" href="#L178" id="L178">
178
</a>
<a class="file-line-num diff-line-num" data-line-number="179" href="#L179" id="L179">
179
</a>
<a class="file-line-num diff-line-num" data-line-number="180" href="#L180" id="L180">
180
</a>
<a class="file-line-num diff-line-num" data-line-number="181" href="#L181" id="L181">
181
</a>
<a class="file-line-num diff-line-num" data-line-number="182" href="#L182" id="L182">
182
</a>
<a class="file-line-num diff-line-num" data-line-number="183" href="#L183" id="L183">
183
</a>
<a class="file-line-num diff-line-num" data-line-number="184" href="#L184" id="L184">
184
</a>
<a class="file-line-num diff-line-num" data-line-number="185" href="#L185" id="L185">
185
</a>
<a class="file-line-num diff-line-num" data-line-number="186" href="#L186" id="L186">
186
</a>
<a class="file-line-num diff-line-num" data-line-number="187" href="#L187" id="L187">
187
</a>
<a class="file-line-num diff-line-num" data-line-number="188" href="#L188" id="L188">
188
</a>
<a class="file-line-num diff-line-num" data-line-number="189" href="#L189" id="L189">
189
</a>
<a class="file-line-num diff-line-num" data-line-number="190" href="#L190" id="L190">
190
</a>
<a class="file-line-num diff-line-num" data-line-number="191" href="#L191" id="L191">
191
</a>
<a class="file-line-num diff-line-num" data-line-number="192" href="#L192" id="L192">
192
</a>
<a class="file-line-num diff-line-num" data-line-number="193" href="#L193" id="L193">
193
</a>
<a class="file-line-num diff-line-num" data-line-number="194" href="#L194" id="L194">
194
</a>
<a class="file-line-num diff-line-num" data-line-number="195" href="#L195" id="L195">
195
</a>
<a class="file-line-num diff-line-num" data-line-number="196" href="#L196" id="L196">
196
</a>
<a class="file-line-num diff-line-num" data-line-number="197" href="#L197" id="L197">
197
</a>
<a class="file-line-num diff-line-num" data-line-number="198" href="#L198" id="L198">
198
</a>
<a class="file-line-num diff-line-num" data-line-number="199" href="#L199" id="L199">
199
</a>
<a class="file-line-num diff-line-num" data-line-number="200" href="#L200" id="L200">
200
</a>
<a class="file-line-num diff-line-num" data-line-number="201" href="#L201" id="L201">
201
</a>
<a class="file-line-num diff-line-num" data-line-number="202" href="#L202" id="L202">
202
</a>
<a class="file-line-num diff-line-num" data-line-number="203" href="#L203" id="L203">
203
</a>
<a class="file-line-num diff-line-num" data-line-number="204" href="#L204" id="L204">
204
</a>
<a class="file-line-num diff-line-num" data-line-number="205" href="#L205" id="L205">
205
</a>
<a class="file-line-num diff-line-num" data-line-number="206" href="#L206" id="L206">
206
</a>
<a class="file-line-num diff-line-num" data-line-number="207" href="#L207" id="L207">
207
</a>
<a class="file-line-num diff-line-num" data-line-number="208" href="#L208" id="L208">
208
</a>
<a class="file-line-num diff-line-num" data-line-number="209" href="#L209" id="L209">
209
</a>
<a class="file-line-num diff-line-num" data-line-number="210" href="#L210" id="L210">
210
</a>
<a class="file-line-num diff-line-num" data-line-number="211" href="#L211" id="L211">
211
</a>
<a class="file-line-num diff-line-num" data-line-number="212" href="#L212" id="L212">
212
</a>
<a class="file-line-num diff-line-num" data-line-number="213" href="#L213" id="L213">
213
</a>
<a class="file-line-num diff-line-num" data-line-number="214" href="#L214" id="L214">
214
</a>
<a class="file-line-num diff-line-num" data-line-number="215" href="#L215" id="L215">
215
</a>
<a class="file-line-num diff-line-num" data-line-number="216" href="#L216" id="L216">
216
</a>
<a class="file-line-num diff-line-num" data-line-number="217" href="#L217" id="L217">
217
</a>
<a class="file-line-num diff-line-num" data-line-number="218" href="#L218" id="L218">
218
</a>
<a class="file-line-num diff-line-num" data-line-number="219" href="#L219" id="L219">
219
</a>
<a class="file-line-num diff-line-num" data-line-number="220" href="#L220" id="L220">
220
</a>
<a class="file-line-num diff-line-num" data-line-number="221" href="#L221" id="L221">
221
</a>
<a class="file-line-num diff-line-num" data-line-number="222" href="#L222" id="L222">
222
</a>
<a class="file-line-num diff-line-num" data-line-number="223" href="#L223" id="L223">
223
</a>
<a class="file-line-num diff-line-num" data-line-number="224" href="#L224" id="L224">
224
</a>
<a class="file-line-num diff-line-num" data-line-number="225" href="#L225" id="L225">
225
</a>
<a class="file-line-num diff-line-num" data-line-number="226" href="#L226" id="L226">
226
</a>
<a class="file-line-num diff-line-num" data-line-number="227" href="#L227" id="L227">
227
</a>
<a class="file-line-num diff-line-num" data-line-number="228" href="#L228" id="L228">
228
</a>
<a class="file-line-num diff-line-num" data-line-number="229" href="#L229" id="L229">
229
</a>
<a class="file-line-num diff-line-num" data-line-number="230" href="#L230" id="L230">
230
</a>
<a class="file-line-num diff-line-num" data-line-number="231" href="#L231" id="L231">
231
</a>
<a class="file-line-num diff-line-num" data-line-number="232" href="#L232" id="L232">
232
</a>
<a class="file-line-num diff-line-num" data-line-number="233" href="#L233" id="L233">
233
</a>
<a class="file-line-num diff-line-num" data-line-number="234" href="#L234" id="L234">
234
</a>
<a class="file-line-num diff-line-num" data-line-number="235" href="#L235" id="L235">
235
</a>
<a class="file-line-num diff-line-num" data-line-number="236" href="#L236" id="L236">
236
</a>
<a class="file-line-num diff-line-num" data-line-number="237" href="#L237" id="L237">
237
</a>
<a class="file-line-num diff-line-num" data-line-number="238" href="#L238" id="L238">
238
</a>
<a class="file-line-num diff-line-num" data-line-number="239" href="#L239" id="L239">
239
</a>
<a class="file-line-num diff-line-num" data-line-number="240" href="#L240" id="L240">
240
</a>
<a class="file-line-num diff-line-num" data-line-number="241" href="#L241" id="L241">
241
</a>
<a class="file-line-num diff-line-num" data-line-number="242" href="#L242" id="L242">
242
</a>
<a class="file-line-num diff-line-num" data-line-number="243" href="#L243" id="L243">
243
</a>
<a class="file-line-num diff-line-num" data-line-number="244" href="#L244" id="L244">
244
</a>
</div>
<div class="blob-content" data-blob-id="01dd3290f8c8cbdeab0a2428d8b775a16a063bc5" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-qa-selector="file_content">
<pre class="code highlight"><code><span id="LC1" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC2" class="line" lang="java"><span class="cm"> * Copyright (c) 1996, 2000, Oracle and/or its affiliates. All rights reserved.</span></span>
<span id="LC3" class="line" lang="java"><span class="cm"> * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.</span></span>
<span id="LC4" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC5" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC6" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC7" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC8" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC9" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC10" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC11" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC12" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC13" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC14" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC15" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC16" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC17" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC18" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC19" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC20" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC21" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC22" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC23" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC24" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC25" class="line" lang="java"></span>
<span id="LC26" class="line" lang="java"><span class="kn">package</span> <span class="nn">org.omg.CORBA</span><span class="o">;</span></span>
<span id="LC27" class="line" lang="java"></span>
<span id="LC28" class="line" lang="java"><span class="cm">/**</span></span>
<span id="LC29" class="line" lang="java"><span class="cm"> * An object used in &lt;code&gt;Request&lt;/code&gt; operations</span></span>
<span id="LC30" class="line" lang="java"><span class="cm"> * to specify the context object in which context strings</span></span>
<span id="LC31" class="line" lang="java"><span class="cm"> * must be resolved before being sent along with the request invocation.</span></span>
<span id="LC32" class="line" lang="java"><span class="cm"> * A &lt;code&gt;Context&lt;/code&gt; object</span></span>
<span id="LC33" class="line" lang="java"><span class="cm"> * contains a list of properties in the form of &lt;code&gt;NamedValue&lt;/code&gt;</span></span>
<span id="LC34" class="line" lang="java"><span class="cm"> * objects. These properties represent information</span></span>
<span id="LC35" class="line" lang="java"><span class="cm"> * about the client, the environment, or the circumstances of a request</span></span>
<span id="LC36" class="line" lang="java"><span class="cm"> * and generally are properties that might be inconvenient</span></span>
<span id="LC37" class="line" lang="java"><span class="cm"> * to pass as parameters.</span></span>
<span id="LC38" class="line" lang="java"><span class="cm"> * &lt;P&gt;</span></span>
<span id="LC39" class="line" lang="java"><span class="cm"> * A &lt;code&gt;Context&lt;/code&gt; object is created by first calling the</span></span>
<span id="LC40" class="line" lang="java"><span class="cm"> * &lt;code&gt;ORB&lt;/code&gt; method &lt;code&gt;get_default_context&lt;/code&gt;</span></span>
<span id="LC41" class="line" lang="java"><span class="cm"> * and then calling the method &lt;code&gt;create_child&lt;/code&gt; on the</span></span>
<span id="LC42" class="line" lang="java"><span class="cm"> * default context.</span></span>
<span id="LC43" class="line" lang="java"><span class="cm"> * &lt;P&gt;</span></span>
<span id="LC44" class="line" lang="java"><span class="cm"> * Each property in a &lt;code&gt;Context&lt;/code&gt; object is represented by</span></span>
<span id="LC45" class="line" lang="java"><span class="cm"> * a &lt;code&gt;NamedValue&lt;/code&gt; object.  The property name is contained</span></span>
<span id="LC46" class="line" lang="java"><span class="cm"> * in the &lt;code&gt;NamedValue&lt;/code&gt; object's &lt;code&gt;name&lt;/code&gt; field, and</span></span>
<span id="LC47" class="line" lang="java"><span class="cm"> * the value associated with the name is contained in the &lt;code&gt;Any&lt;/code&gt;</span></span>
<span id="LC48" class="line" lang="java"><span class="cm"> * object that was assigned to the &lt;code&gt;NamedValue&lt;/code&gt; object's</span></span>
<span id="LC49" class="line" lang="java"><span class="cm"> * &lt;code&gt;value&lt;/code&gt; field.</span></span>
<span id="LC50" class="line" lang="java"><span class="cm"> * &lt;P&gt;</span></span>
<span id="LC51" class="line" lang="java"><span class="cm"> * &lt;code&gt;Context&lt;/code&gt; properties can represent a portion of a client's</span></span>
<span id="LC52" class="line" lang="java"><span class="cm"> * or application's environment that is meant to be propagated to</span></span>
<span id="LC53" class="line" lang="java"><span class="cm"> * (and made implicitly part of) a server's environment.</span></span>
<span id="LC54" class="line" lang="java"><span class="cm"> * (Examples might be a window identifier or user preference information).</span></span>
<span id="LC55" class="line" lang="java"><span class="cm"> * Once a server has been invoked (that is, after the properties are</span></span>
<span id="LC56" class="line" lang="java"><span class="cm"> * propagated), the server may query its &lt;code&gt;Context&lt;/code&gt; object</span></span>
<span id="LC57" class="line" lang="java"><span class="cm"> * for these properties using the method &lt;code&gt;get_values&lt;/code&gt;.</span></span>
<span id="LC58" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC59" class="line" lang="java"><span class="cm"> *&lt;P&gt;</span></span>
<span id="LC60" class="line" lang="java"><span class="cm"> * When an operation declaration includes a context clause,</span></span>
<span id="LC61" class="line" lang="java"><span class="cm"> * the stubs and skeletons will have an additional argument</span></span>
<span id="LC62" class="line" lang="java"><span class="cm"> * added for the context.  When an operation invocation occurs,</span></span>
<span id="LC63" class="line" lang="java"><span class="cm"> * the ORB causes the properties that were named in the operation</span></span>
<span id="LC64" class="line" lang="java"><span class="cm"> * definition in IDL and</span></span>
<span id="LC65" class="line" lang="java"><span class="cm"> * that are present in the client's &lt;code&gt;Context&lt;/code&gt; object</span></span>
<span id="LC66" class="line" lang="java"><span class="cm"> * to be provided in the &lt;code&gt;Context&lt;/code&gt; object parameter to</span></span>
<span id="LC67" class="line" lang="java"><span class="cm"> * the invoked method.</span></span>
<span id="LC68" class="line" lang="java"><span class="cm"> * &lt;P&gt;</span></span>
<span id="LC69" class="line" lang="java"><span class="cm"> * &lt;code&gt;Context&lt;/code&gt; property names (which are strings)</span></span>
<span id="LC70" class="line" lang="java"><span class="cm"> * typically have the form of an OMG IDL identifier or</span></span>
<span id="LC71" class="line" lang="java"><span class="cm"> * a series of OMG IDL identifiers separated by periods.</span></span>
<span id="LC72" class="line" lang="java"><span class="cm"> * A context property name pattern is either a property name</span></span>
<span id="LC73" class="line" lang="java"><span class="cm"> * or a property name followed by a single "*".  A property</span></span>
<span id="LC74" class="line" lang="java"><span class="cm"> * name pattern without a trailing "*" is said to match only</span></span>
<span id="LC75" class="line" lang="java"><span class="cm"> * itself.  A property name pattern of the form "&amp;lt;name&amp;gt;*" matches any</span></span>
<span id="LC76" class="line" lang="java"><span class="cm"> * property name that starts with &amp;lt;name&amp;gt; and continues with zero</span></span>
<span id="LC77" class="line" lang="java"><span class="cm"> * or more additional characters.</span></span>
<span id="LC78" class="line" lang="java"><span class="cm"> * &lt;P&gt;</span></span>
<span id="LC79" class="line" lang="java"><span class="cm"> * Property name patterns are used in the context clause of</span></span>
<span id="LC80" class="line" lang="java"><span class="cm"> * an operation definition and as a parameter for the</span></span>
<span id="LC81" class="line" lang="java"><span class="cm"> * method &lt;code&gt;Context.get_values&lt;/code&gt;.</span></span>
<span id="LC82" class="line" lang="java"><span class="cm"> * &lt;P&gt;</span></span>
<span id="LC83" class="line" lang="java"><span class="cm"> * &lt;code&gt;Context&lt;/code&gt; objects may be "chained" together to achieve a</span></span>
<span id="LC84" class="line" lang="java"><span class="cm"> * particular defaulting behavior.  A &lt;code&gt;Context&lt;/code&gt;</span></span>
<span id="LC85" class="line" lang="java"><span class="cm"> * object created with the method &lt;code&gt;create_child&lt;/code&gt; will</span></span>
<span id="LC86" class="line" lang="java"><span class="cm"> * be chained to its parent (the &lt;code&gt;Context&lt;/code&gt; object</span></span>
<span id="LC87" class="line" lang="java"><span class="cm"> * that created it), and that means that the parent will be searched</span></span>
<span id="LC88" class="line" lang="java"><span class="cm"> * after the child in a search for property names.</span></span>
<span id="LC89" class="line" lang="java"><span class="cm"> *&lt;P&gt;</span></span>
<span id="LC90" class="line" lang="java"><span class="cm"> * Properties defined in a particular &lt;code&gt;Context&lt;/code&gt; object</span></span>
<span id="LC91" class="line" lang="java"><span class="cm"> * effectively override those properties in the next higher level.</span></span>
<span id="LC92" class="line" lang="java"><span class="cm"> * The scope used in a search for properties may be restricted by specifying a</span></span>
<span id="LC93" class="line" lang="java"><span class="cm"> * starting scope and by using the flag &lt;code&gt;CTX_RESTRICT_SCOPE&lt;/code&gt;</span></span>
<span id="LC94" class="line" lang="java"><span class="cm"> * when invoking the method &lt;code&gt;get_values&lt;/code&gt;.</span></span>
<span id="LC95" class="line" lang="java"><span class="cm"> * &lt;P&gt;</span></span>
<span id="LC96" class="line" lang="java"><span class="cm"> * A &lt;code&gt;Context&lt;/code&gt; object may be named for purposes of specifying</span></span>
<span id="LC97" class="line" lang="java"><span class="cm"> * a starting search scope.</span></span>
<span id="LC98" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC99" class="line" lang="java"><span class="cm"> * @since   JDK1.2</span></span>
<span id="LC100" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC101" class="line" lang="java"></span>
<span id="LC102" class="line" lang="java"><span class="kd">public</span> <span class="kd">abstract</span> <span class="kd">class</span> <span class="nc">Context</span> <span class="o">{</span></span>
<span id="LC103" class="line" lang="java"></span>
<span id="LC104" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC105" class="line" lang="java"><span class="cm">     * Retrieves the name of this &lt;code&gt;Context&lt;/code&gt; object.</span></span>
<span id="LC106" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC107" class="line" lang="java"><span class="cm">     * @return                  the name of this &lt;code&gt;Context&lt;/code&gt; object</span></span>
<span id="LC108" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC109" class="line" lang="java"></span>
<span id="LC110" class="line" lang="java">    <span class="kd">public</span> <span class="kd">abstract</span> <span class="nc">String</span> <span class="nf">context_name</span><span class="o">();</span></span>
<span id="LC111" class="line" lang="java"></span>
<span id="LC112" class="line" lang="java"></span>
<span id="LC113" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC114" class="line" lang="java"><span class="cm">     * Retrieves the parent of this &lt;code&gt;Context&lt;/code&gt; object.</span></span>
<span id="LC115" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC116" class="line" lang="java"><span class="cm">     * @return                  the &lt;code&gt;Context&lt;/code&gt; object that is the</span></span>
<span id="LC117" class="line" lang="java"><span class="cm">     *                    parent of this &lt;code&gt;Context&lt;/code&gt; object</span></span>
<span id="LC118" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC119" class="line" lang="java"></span>
<span id="LC120" class="line" lang="java">    <span class="kd">public</span> <span class="kd">abstract</span> <span class="nc">Context</span> <span class="nf">parent</span><span class="o">();</span></span>
<span id="LC121" class="line" lang="java"></span>
<span id="LC122" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC123" class="line" lang="java"><span class="cm">     * Creates a &lt;code&gt;Context&lt;/code&gt; object with the given string as its</span></span>
<span id="LC124" class="line" lang="java"><span class="cm">     * name and with this &lt;code&gt;Context&lt;/code&gt; object set as its parent.</span></span>
<span id="LC125" class="line" lang="java"><span class="cm">     * &lt;P&gt;</span></span>
<span id="LC126" class="line" lang="java"><span class="cm">     * The new &lt;code&gt;Context&lt;/code&gt; object is chained into its parent</span></span>
<span id="LC127" class="line" lang="java"><span class="cm">     * &lt;code&gt;Context&lt;/code&gt; object.  This means that in a search for</span></span>
<span id="LC128" class="line" lang="java"><span class="cm">     * matching property names, if a match is not found in this context,</span></span>
<span id="LC129" class="line" lang="java"><span class="cm">     * the search will continue in the parent.  If that is not successful,</span></span>
<span id="LC130" class="line" lang="java"><span class="cm">     * the search will continue in the grandparent, if there is one, and</span></span>
<span id="LC131" class="line" lang="java"><span class="cm">     * so on.</span></span>
<span id="LC132" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC133" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC134" class="line" lang="java"><span class="cm">     * @param child_ctx_name    the &lt;code&gt;String&lt;/code&gt; object to be set as</span></span>
<span id="LC135" class="line" lang="java"><span class="cm">     *                        the name of the new &lt;code&gt;Context&lt;/code&gt; object</span></span>
<span id="LC136" class="line" lang="java"><span class="cm">     * @return                  the newly-created child &lt;code&gt;Context&lt;/code&gt; object</span></span>
<span id="LC137" class="line" lang="java"><span class="cm">     *                    initialized with the specified name</span></span>
<span id="LC138" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC139" class="line" lang="java"></span>
<span id="LC140" class="line" lang="java">    <span class="kd">public</span> <span class="kd">abstract</span> <span class="nc">Context</span> <span class="nf">create_child</span><span class="o">(</span><span class="nc">String</span> <span class="n">child_ctx_name</span><span class="o">);</span></span>
<span id="LC141" class="line" lang="java"></span>
<span id="LC142" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC143" class="line" lang="java"><span class="cm">     * Creates a &lt;code&gt;NamedValue&lt;/code&gt; object and adds it to this</span></span>
<span id="LC144" class="line" lang="java"><span class="cm">     * &lt;code&gt;Context&lt;/code&gt; object.  The &lt;code&gt;name&lt;/code&gt; field of the</span></span>
<span id="LC145" class="line" lang="java"><span class="cm">     * new &lt;code&gt;NamedValue&lt;/code&gt; object is set to the given string,</span></span>
<span id="LC146" class="line" lang="java"><span class="cm">     * the &lt;code&gt;value&lt;/code&gt; field is set to the given &lt;code&gt;Any&lt;/code&gt;</span></span>
<span id="LC147" class="line" lang="java"><span class="cm">     * object, and the &lt;code&gt;flags&lt;/code&gt; field is set to zero.</span></span>
<span id="LC148" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC149" class="line" lang="java"><span class="cm">     * @param propname          the name of the property to be set</span></span>
<span id="LC150" class="line" lang="java"><span class="cm">     * @param propvalue         the &lt;code&gt;Any&lt;/code&gt; object to which the</span></span>
<span id="LC151" class="line" lang="java"><span class="cm">     *                        value of the property will be set.  The</span></span>
<span id="LC152" class="line" lang="java"><span class="cm">     *                        &lt;code&gt;Any&lt;/code&gt; object's &lt;code&gt;value&lt;/code&gt;</span></span>
<span id="LC153" class="line" lang="java"><span class="cm">     *                        field contains the value to be associated</span></span>
<span id="LC154" class="line" lang="java"><span class="cm">     *                        with the given propname; the</span></span>
<span id="LC155" class="line" lang="java"><span class="cm">     *                        &lt;code&gt;kind&lt;/code&gt; field must be set to</span></span>
<span id="LC156" class="line" lang="java"><span class="cm">     *                        &lt;code&gt;TCKind.tk_string&lt;/code&gt;.</span></span>
<span id="LC157" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC158" class="line" lang="java"></span>
<span id="LC159" class="line" lang="java">    <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">void</span> <span class="nf">set_one_value</span><span class="o">(</span><span class="nc">String</span> <span class="n">propname</span><span class="o">,</span> <span class="nc">Any</span> <span class="n">propvalue</span><span class="o">);</span></span>
<span id="LC160" class="line" lang="java"></span>
<span id="LC161" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC162" class="line" lang="java"><span class="cm">       I Sets one or more property values in this &lt;code&gt;Context&lt;/code&gt;</span></span>
<span id="LC163" class="line" lang="java"><span class="cm">       * object. The &lt;code&gt;NVList&lt;/code&gt; supplied to this method</span></span>
<span id="LC164" class="line" lang="java"><span class="cm">       * contains one or more &lt;code&gt;NamedValue&lt;/code&gt; objects.</span></span>
<span id="LC165" class="line" lang="java"><span class="cm">       * In each &lt;code&gt;NamedValue&lt;/code&gt; object,</span></span>
<span id="LC166" class="line" lang="java"><span class="cm">       * the &lt;code&gt;name&lt;/code&gt; field holds the name of the property, and</span></span>
<span id="LC167" class="line" lang="java"><span class="cm">       * the &lt;code&gt;flags&lt;/code&gt; field must be set to zero.</span></span>
<span id="LC168" class="line" lang="java"><span class="cm">       * The &lt;code&gt;NamedValue&lt;/code&gt; object's &lt;code&gt;value&lt;/code&gt; field</span></span>
<span id="LC169" class="line" lang="java"><span class="cm">       * contains an &lt;code&gt;Any&lt;/code&gt; object, which, in turn, contains the value</span></span>
<span id="LC170" class="line" lang="java"><span class="cm">       * for the property.  Since the value is always a string,</span></span>
<span id="LC171" class="line" lang="java"><span class="cm">       * the &lt;code&gt;Any&lt;/code&gt; object must have the &lt;code&gt;kind&lt;/code&gt;</span></span>
<span id="LC172" class="line" lang="java"><span class="cm">       * field of its &lt;code&gt;TypeCode&lt;/code&gt; set to &lt;code&gt;TCKind.tk_string&lt;/code&gt;.</span></span>
<span id="LC173" class="line" lang="java"><span class="cm">       *</span></span>
<span id="LC174" class="line" lang="java"><span class="cm">       * @param values          an NVList containing the property</span></span>
<span id="LC175" class="line" lang="java"><span class="cm">       *                                    names and associated values to be set</span></span>
<span id="LC176" class="line" lang="java"><span class="cm">       *</span></span>
<span id="LC177" class="line" lang="java"><span class="cm">       * @see #get_values</span></span>
<span id="LC178" class="line" lang="java"><span class="cm">       * @see org.omg.CORBA.NamedValue</span></span>
<span id="LC179" class="line" lang="java"><span class="cm">       * @see org.omg.CORBA.Any</span></span>
<span id="LC180" class="line" lang="java"><span class="cm">       */</span></span>
<span id="LC181" class="line" lang="java"></span>
<span id="LC182" class="line" lang="java">    <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">void</span> <span class="nf">set_values</span><span class="o">(</span><span class="nc">NVList</span> <span class="n">values</span><span class="o">);</span></span>
<span id="LC183" class="line" lang="java"></span>
<span id="LC184" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC185" class="line" lang="java"><span class="cm">     * Deletes from this &lt;code&gt;Context&lt;/code&gt; object the</span></span>
<span id="LC186" class="line" lang="java"><span class="cm">     * &lt;code&gt;NamedValue&lt;/code&gt; object(s) whose</span></span>
<span id="LC187" class="line" lang="java"><span class="cm">     * &lt;code&gt;name&lt;/code&gt; field matches the given property name.</span></span>
<span id="LC188" class="line" lang="java"><span class="cm">     * If the &lt;code&gt;String&lt;/code&gt; object supplied for</span></span>
<span id="LC189" class="line" lang="java"><span class="cm">     * &lt;code&gt;propname&lt;/code&gt; has a</span></span>
<span id="LC190" class="line" lang="java"><span class="cm">     * trailing wildcard character ("*"), then</span></span>
<span id="LC191" class="line" lang="java"><span class="cm">     * all &lt;code&gt;NamedValue&lt;/code&gt; objects whose &lt;code&gt;name&lt;/code&gt;</span></span>
<span id="LC192" class="line" lang="java"><span class="cm">     * fields match will be deleted. The search scope is always</span></span>
<span id="LC193" class="line" lang="java"><span class="cm">     * limited to this &lt;code&gt;Context&lt;/code&gt; object.</span></span>
<span id="LC194" class="line" lang="java"><span class="cm">     * &lt;P&gt;</span></span>
<span id="LC195" class="line" lang="java"><span class="cm">     * If no matching property is found, an exception is returned.</span></span>
<span id="LC196" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC197" class="line" lang="java"><span class="cm">     * @param propname          name of the property to be deleted</span></span>
<span id="LC198" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC199" class="line" lang="java"></span>
<span id="LC200" class="line" lang="java">    <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">void</span> <span class="nf">delete_values</span><span class="o">(</span><span class="nc">String</span> <span class="n">propname</span><span class="o">);</span></span>
<span id="LC201" class="line" lang="java"></span>
<span id="LC202" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC203" class="line" lang="java"><span class="cm">     * Retrieves the &lt;code&gt;NamedValue&lt;/code&gt; objects whose</span></span>
<span id="LC204" class="line" lang="java"><span class="cm">     * &lt;code&gt;name&lt;/code&gt; field matches the given name or name</span></span>
<span id="LC205" class="line" lang="java"><span class="cm">     * pattern.   This method allows for wildcard searches,</span></span>
<span id="LC206" class="line" lang="java"><span class="cm">     * which means that there can be multiple matches and</span></span>
<span id="LC207" class="line" lang="java"><span class="cm">     * therefore multiple values returned. If the</span></span>
<span id="LC208" class="line" lang="java"><span class="cm">     * property is not found at the indicated level, the search</span></span>
<span id="LC209" class="line" lang="java"><span class="cm">     * continues up the context object tree until a match is found or</span></span>
<span id="LC210" class="line" lang="java"><span class="cm">     * all &lt;code&gt;Context&lt;/code&gt; objects in the chain have been exhausted.</span></span>
<span id="LC211" class="line" lang="java"><span class="cm">     * &lt;P&gt;</span></span>
<span id="LC212" class="line" lang="java"><span class="cm">     * If no match is found, an error is returned and no property list</span></span>
<span id="LC213" class="line" lang="java"><span class="cm">     * is returned.</span></span>
<span id="LC214" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC215" class="line" lang="java"><span class="cm">     * @param start_scope               a &lt;code&gt;String&lt;/code&gt; object indicating the</span></span>
<span id="LC216" class="line" lang="java"><span class="cm">     *                context object level at which to initiate the</span></span>
<span id="LC217" class="line" lang="java"><span class="cm">     *                          search for the specified properties</span></span>
<span id="LC218" class="line" lang="java"><span class="cm">     *                          (for example, "_USER", "_GROUP", "_SYSTEM"). Valid scope</span></span>
<span id="LC219" class="line" lang="java"><span class="cm">     *                          names are implementation-specific. If a</span></span>
<span id="LC220" class="line" lang="java"><span class="cm">     *                          scope name is omitted, the search</span></span>
<span id="LC221" class="line" lang="java"><span class="cm">     *                          begins with the specified context</span></span>
<span id="LC222" class="line" lang="java"><span class="cm">     *                          object. If the specified scope name is</span></span>
<span id="LC223" class="line" lang="java"><span class="cm">     *                          not found, an exception is returned.</span></span>
<span id="LC224" class="line" lang="java"><span class="cm">     * @param op_flags       an operation flag.  The one flag</span></span>
<span id="LC225" class="line" lang="java"><span class="cm">     *                that may be specified is &lt;code&gt;CTX_RESTRICT_SCOPE&lt;/code&gt;.</span></span>
<span id="LC226" class="line" lang="java"><span class="cm">     *                If this flag is specified, searching is limited to the</span></span>
<span id="LC227" class="line" lang="java"><span class="cm">     *                          specified &lt;code&gt;start_scope&lt;/code&gt; or this</span></span>
<span id="LC228" class="line" lang="java"><span class="cm">     *                &lt;code&gt;Context&lt;/code&gt; object.</span></span>
<span id="LC229" class="line" lang="java"><span class="cm">     * @param pattern           the property name whose values are to</span></span>
<span id="LC230" class="line" lang="java"><span class="cm">     *                          be retrieved. &lt;code&gt;pattern&lt;/code&gt; may be a</span></span>
<span id="LC231" class="line" lang="java"><span class="cm">     *                name or a name with a</span></span>
<span id="LC232" class="line" lang="java"><span class="cm">     *                          trailing wildcard character ("*").</span></span>
<span id="LC233" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC234" class="line" lang="java"><span class="cm">     * @return          an &lt;code&gt;NVList&lt;/code&gt; containing all the property values</span></span>
<span id="LC235" class="line" lang="java"><span class="cm">     *                (in the form of &lt;code&gt;NamedValue&lt;/code&gt; objects)</span></span>
<span id="LC236" class="line" lang="java"><span class="cm">     *                whose associated property name matches the given name or</span></span>
<span id="LC237" class="line" lang="java"><span class="cm">     *                name pattern</span></span>
<span id="LC238" class="line" lang="java"><span class="cm">     * @see #set_values</span></span>
<span id="LC239" class="line" lang="java"><span class="cm">     * @see org.omg.CORBA.NamedValue</span></span>
<span id="LC240" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC241" class="line" lang="java"></span>
<span id="LC242" class="line" lang="java">    <span class="kd">abstract</span> <span class="kd">public</span> <span class="nc">NVList</span> <span class="nf">get_values</span><span class="o">(</span><span class="nc">String</span> <span class="n">start_scope</span><span class="o">,</span> <span class="kt">int</span> <span class="n">op_flags</span><span class="o">,</span></span>
<span id="LC243" class="line" lang="java">                                      <span class="nc">String</span> <span class="n">pattern</span><span class="o">);</span></span>
<span id="LC244" class="line" lang="java"><span class="o">};</span></span>
